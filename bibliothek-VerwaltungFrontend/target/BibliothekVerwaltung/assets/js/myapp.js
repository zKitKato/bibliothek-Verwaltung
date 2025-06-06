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
        case 'All Books':
            $('#listBooks').addClass('active');
            $('a_'+menu).addClass('active');
        default:
            $('#home').addClass('active');
            break;
    }
});