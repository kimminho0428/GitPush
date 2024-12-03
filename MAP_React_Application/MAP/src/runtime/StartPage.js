import React, { useState } from 'react';
import {useToasts} from 'react-toast-notifications';
import axios from 'axios';
import {makeJson} from './JsonFactory'
import {convertPressedKey} from './KeyEvent';
import {screenDto} from './Default';
import './StartPage.scss';
import config from '../config/config.json';

const StartPage = ({history}) => {

  const {addToast} = useToasts();
  const server_url = config.SERVER_URL;
  const transList = config.ENTRY_TRANSACTION;
  const userId = '태훈';

  /*
   * Key Event
   */
  const onClick = (path) => {
    init(path, userId);
  }

  const init = (path, userId) => {
    request(path, userId);
  }

  /*
   * Request Server and Process Response Data
   */
  const request = (path, userId) => {
    const url = server_url + path;
    const inputData = makeJson(userId, convertPressedKey(13));
    console.log("[start page] request : ", inputData);

    axios.post(url, inputData, {withCredentials: true}).then(response => {
      const responseDto = response.data;
      console.log("[start page] response  : " + JSON.stringify(responseDto));
      if(responseDto != null) {
        if(responseDto.pageName != null) {
          history.replace({
            pathname: '/' + responseDto.pageName,
            state: {
              response : response.data,
              url : server_url + "api/v2/OF21/",
              termId : '태훈',
              startCode : 'TD',
              path : '/' + responseDto.pageName
            }
          });
        }
      }
    }).catch((error) => {
      console.log("error : " + JSON.stringify(error));
      const errorReasons = error.response.data.exception.name.split('.');
      const errorReason = errorReasons[errorReasons.length - 1];
      const errorMsg = error.message;
    });
  }

  /*
   * Rendering
   */
  return (
      <div className = "StartPage">
        <div className = 'empty_left'></div>
        {
          transList.map((trans) =>
            <button type = 'submit' onClick = {() => onClick(trans.url)}>{trans.name}</button>
          )
        }
        <div className = 'empty_right'></div>
      </div>
  );
};

export default StartPage;
