import notificationContent from "./json/NotificationContent.json";

const dtoJson = {

    "systemDto": {
        "application": "",
        "startCode": "TD",
        "pressedKey": "\'",
        "nextTransaction": "",
        "serviceId": "",
        "immediate": false,
        "notification" : ""
    },
    "pageName": ""

}

const makeJson = (userId, pressedKey) => {

    //system attribute
    dtoJson.systemDto.startCode = 'TD';
    dtoJson.systemDto.pressedKey = pressedKey;
    dtoJson.systemDto.userId = userId;

    return dtoJson;
}

const makeContentJson = (id, severity, title, content) => {
    let _notificationContent = notificationContent;
    _notificationContent.id = id;
    _notificationContent.severity = severity;
    _notificationContent.title = title;
    _notificationContent.content = content;

    return _notificationContent;
}

const parsedSystemDto = requestDto => {
    return requestDto.dto.systemDto;
}

const parsedScreenDto = requestDto => {
    return requestDto.dto.screenDto;
}

const calculateMeta = (parsedData) => {
    let meta = {};
    const keys = Object.keys(parsedData);
    for(const key of keys) {
        if(parsedData[key] == null || parsedData[key].trimRight().length === 0) {
            meta[key + '_length'] = 0;
        } else {
            meta[key + '_length'] = parsedData[key].trimRight().length;
        }
    }
    return meta;
}

export {dtoJson, makeContentJson, makeJson, parsedSystemDto, parsedScreenDto, calculateMeta};