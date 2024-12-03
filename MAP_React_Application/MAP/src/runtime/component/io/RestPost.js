import React from 'react';
import axios from "axios";

const RestPost = (history, inputDto, serverUrl, defaultPageName) => {

    const nextTransaction = inputDto.systemDto.nextTransaction;

    if(!nextTransaction) {
        history.replace({
            pathname: '/',
            state: {
                url : serverUrl,
                termId : 'REACT',
                startCode : 'TD',
                path : '/'
            }
        });
    } else {
        axios.post(serverUrl + nextTransaction, inputDto, {withCredentials: true}).then(response => {
            const responseDto = response.data;
            const pageName = responseDto.pageName === null ? defaultPageName : responseDto.pageName;

            if(responseDto != null) {
                // if(screenDto.text != null) {
                //     addToast(screenDto.text, {
                //         appearance: 'info',
                //         autoDismiss: false,
                //     });
                // }

                history.replace({
                    pathname: '/' + pageName,
                    state: {
                        response : responseDto,
                        url : serverUrl,
                        termId : 'REACT',
                        startCode : 'TD',
                        path : '/' + responseDto.pageName
                    }
                });
            }
        }).catch((error) => {
            console.log("error : " + JSON.stringify(error));
            // const errorReasons = error.response.data.exception.name.split('.');
            // const errorReason = errorReasons[errorReasons.length - 1];
            // const errorMsg = error.message;
            // addToast(errorMsg + ' [' + errorReason + ']. check sever log', {
            //     appearance: 'error',
            //     autoDismiss: true,
            //     autoDismissTimeout: 10000,
            // });
        });
    }
};
export default RestPost;

