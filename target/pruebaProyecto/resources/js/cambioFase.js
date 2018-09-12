var actual, next, anterior;
var left, opacity, scale;

$(".next").click(function () {
    actual = $(this).parent();
    next = $(this).parent().next();

    next.show();
    actual.animate({opacity: 0}, {
        step: function (now, mx) {
            scale = 1 - (1 - now) * 0.2;
            left = (now * 50) + "%";
            opacity = 1 - now;
            actual.css({'transform': 'scale(' + scale + ')'});
            next.css({'left': left, 'opacity': opacity});
        }, duration: 800,
        complete: function () {
            actual.hide();
        }, erasing: 'easeInOutBack'
    })
});

$(".previous").click(function () {
    actual = $(this).parent();
    anterior = $(this).parent().prev();

    anterior.show();
    actual.animate({opacity: 0}, {
        step: function (now, mx) {
            scale = 0.8 + (1 - now) * 0.2;
            left = ((1 - now) * 50) + "%";
            opacity = 1 - now;
            actual.css({'left': left});
            anterior.css({'transform': 'scale(' + scale + ')', 'opacity': opacity});
        }, duration: 800,
        complete: function () {
            actual.hide();
        }, erasing: 'easeInOutBack'
    })
});