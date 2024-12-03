const convertPressedKey = keyEvent => {
    let aidKey;
    switch(keyEvent) {
        case 112://F1
            aidKey = '1';
            break;
        case 113://F2
            aidKey = '2';
            break;
        case 114://F3
            aidKey = '3';
            break;
        case 115://F4
            aidKey = '4';
            break;
        case 116://F5
            aidKey = '5';
            break;
        case 117://F6
            aidKey = '6';
            break;
        case 118://F7
            aidKey = '7';
            break;
        case 119://F8
            aidKey = '8';
            break;
        case 120://F9
            aidKey = '9';
            break;
        case 121://F10
            aidKey = ':';
            break;
        case 122://F11
            aidKey = '#';
            break;
        case 123://F12
            aidKey = '@';
            break;
        case 13://ENTER
            aidKey = '\'';
            break;
        default:
            aidKey = '';
    }
    return aidKey;
}

const changeColorFlag = (color) => {
    let translate = '';
    switch (color) {
        case '1':  //blue
            translate = 'TURQUOISE';
            break;
        case '2':  //red
            translate = 'red';
            break;
        case '3':  //pink
            translate = 'pink';
            break;
        case '4':  //green
            translate = '#81c147';
            break;
        case '5':  //TURQUOISE
            translate = 'TURQUOISE';
            break;
        case '6':  //yellow
            translate = 'yellow';
            break;
        case '7':  //neutral
            translate = '#FFFFF2';
            break;
        default :
            break;
    }
    return translate;
}

const changeHighlight = (reference, highlight) => {
    switch (highlight) {
        case '1':  //BLINK
            reference.current.style.animation = 'blink 1s infinite';
            break;
        case '2':  //REVERSE
            break;
        case '4':  //UNDERLINE
            reference.current.style.textDecoration = 'underline';
            break;
        default :
            break;
    }
}

export {convertPressedKey, changeColorFlag, changeHighlight};