$(function (){
    // active menue
    switch(menu) {
        case 'Contact':
            $('#contact').addClass('active');
            break;

        case 'About Us':
            $('#about').addClass('active');
            break;

        case 'Profile':
            $('#profile').addClass('active');
            break;

        default:
            $('#home').addClass('active');
            break;
    }
});