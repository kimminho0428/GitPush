import TransactionHeader from "./TransactionHeader";
import TransactionList from "./TransactionList";
import * as React from "react";
import TransactionListView from "./TransactionListView";
import ButtonView from "./ButtonView";
import TimeZoneView from "./TimeZoneView";
import LanguageView from "./LanguageView";
import EmailNotificationView from "./EmailNotificationView";
import EmailNotificationFormatView from "./EmailNotificationFormatView";
import {makeJson} from "../../JsonFactory";
import {convertPressedKey} from "../../KeyEvent";
import axios from "axios";
import {useToasts} from "react-toast-notifications";

const PersonalSettings = ({history}) => {

    const {addToast} = useToasts();

    const request = (url, applicationName) => {
        const inputData = makeJson("user", convertPressedKey(13));
        axios.post(url, inputData, {withCredentials: true}).then(response => {
            const responseDto = response.data;
            if (responseDto != null) {
                if (responseDto.pageName != null) {
                    history.replace({
                        pathname: '/' + responseDto.pageName,
                        state: {
                            response: response.data,
                            url: "/api/v2/" + applicationName + "/",
                            termId: 'user',
                            startCode: 'TD',
                            path: '/' + responseDto.pageName
                        }
                    });
                }
            }
        }).catch((error) => {
            console.log("error1 - " + error);
            console.log("error2 - " + JSON.stringify(error));
            /*addToast(error + '. check sever log', {
                appearance: 'error',
                autoDismiss: true,
                autoDismissTimeout: 10000,
            });*/
        });
    }


    return (
        <div style={{marginTop:"2rem", display:"flex", flexDirection:"column", alignItems:"center", justifyContent:"center"}}>
            <div style={{display: "flex", flexWrap: "wrap", flexDirection:"column"}}>
                <h1 style={{display:"flex", alignItems: "center", justifyContent:"center"}} >Personal settings </h1>
                <TimeZoneView />
                <LanguageView/>
                <EmailNotificationView/>
                <EmailNotificationFormatView/>
                <ButtonView request={request} history={history} trans={""} buttonTitle={"Save change"}/>
            </div>

        </div>

    );
};

export default PersonalSettings;