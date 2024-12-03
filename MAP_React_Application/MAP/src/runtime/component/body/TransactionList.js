import * as React from 'react';
import TransactionListView from "./TransactionListView";
import {makeJson} from "../../JsonFactory";
import {convertPressedKey} from "../../KeyEvent";
import axios from "axios";
import {useToasts} from 'react-toast-notifications';
import ButtonView from "./ButtonView";
import config from "../../../config/config.json";
import {useCallback, useEffect} from "react";

const TransactionList = ({history}) => {

    const {addToast} = useToasts();
    const [transaction, setTransaction] = React.useState('');
    const [inputValue, setInputValue] = React.useState('');
    const application = config.APPLICATION_NAME;
    const baseUri = config.BASE_URI;

    const handleChange = (txName) => {
        setTransaction(txName);
        setInputValue(txName);
    };

    const simpleHandler = () => {
        request(baseUri + inputValue, application);
    }

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
            addToast(error + '. check sever log', {
                appearance: 'error',
                autoDismiss: true,
                autoDismissTimeout: 10000,
            });
        });
    }

    const keyEvent = useCallback((event) => {
        if(event.keyCode === 13) {
            simpleHandler();
        }
    });

    useEffect (() => {
        document.addEventListener('keydown', keyEvent, false);
        return () => {
            document.removeEventListener('keydown', keyEvent, false);
        }
    });

    return (
        <div style={{display: "flex", flexWrap: "wrap", flexDirection:"row"}}>
            <TransactionListView
                request={request}
                simpleHandler ={simpleHandler}
                history={history}
                transaction={transaction}
                inputValue = {inputValue}
                handler={handleChange}
            />
            <ButtonView request={request} history={history} trans={transaction} buttonTitle={"Go"}/>
        </div>
    );
};

export default TransactionList;