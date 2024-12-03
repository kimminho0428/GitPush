import React, {useCallback, useEffect, useLayoutEffect, useMemo, useRef, useState} from 'react';
import COTRN01_COTRN1AView from "./COTRN01_COTRN1AView";
import {observer} from "mobx-react";
import useStore from "../store/UseStore";
import Notification from "../runtime/component/notification/Notification";

const COTRN01_COTRN1A = observer(({history, location, children}) => {

    const serverUrl = location.state.url;
    const data = location.state.response;
    const parsedData = data.COTRN1AO;
    const systemDto = data.systemDto;

    const { COTRN01_COTRN1AStore, SystemStore } = useStore();

    const TRNNAMERef = useRef(COTRN01_COTRN1AStore.TRNNAME);
    const TITLE01Ref = useRef(COTRN01_COTRN1AStore.TITLE01);
    const CURDATERef = useRef(COTRN01_COTRN1AStore.CURDATE);
    const PGMNAMERef = useRef(COTRN01_COTRN1AStore.PGMNAME);
    const TITLE02Ref = useRef(COTRN01_COTRN1AStore.TITLE02);
    const CURTIMERef = useRef(COTRN01_COTRN1AStore.CURTIME);
    const TRNIDINRef = useRef(COTRN01_COTRN1AStore.TRNIDIN);
    const TRNIDRef = useRef(COTRN01_COTRN1AStore.TRNID);
    const CARDNUMRef = useRef(COTRN01_COTRN1AStore.CARDNUM);
    const TTYPCDRef = useRef(COTRN01_COTRN1AStore.TTYPCD);
    const TCATCDRef = useRef(COTRN01_COTRN1AStore.TCATCD);
    const TRNSRCRef = useRef(COTRN01_COTRN1AStore.TRNSRC);
    const TDESCRef = useRef(COTRN01_COTRN1AStore.TDESC);
    const TRNAMTRef = useRef(COTRN01_COTRN1AStore.TRNAMT);
    const TORIGDTRef = useRef(COTRN01_COTRN1AStore.TORIGDT);
    const TPROCDTRef = useRef(COTRN01_COTRN1AStore.TPROCDT);
    const MIDRef = useRef(COTRN01_COTRN1AStore.MID);
    const MNAMERef = useRef(COTRN01_COTRN1AStore.MNAME);
    const MCITYRef = useRef(COTRN01_COTRN1AStore.MCITY);
    const MZIPRef = useRef(COTRN01_COTRN1AStore.MZIP);
    const ERRMSGRef = useRef(COTRN01_COTRN1AStore.ERRMSG);



    const onKeyPressedTRNIDIN = event => {
      COTRN01_COTRN1AStore.setTRNIDIN(event.target.value);
      if(event.target.value.length >= 16.0) {
        TRNIDINRef.current.focus();
      }
    }


    const keyEvent = useCallback((event) => {
        if(event.keyCode === 13) {
            COTRN01_COTRN1AStore.request(systemDto, event.keyCode, serverUrl, history, TRNIDINRef);
        } else if(event.keyCode >= 112 && event.keyCode <= 123) {
            event.preventDefault();
            COTRN01_COTRN1AStore.request(systemDto, event.keyCode, serverUrl, history, TRNIDINRef);
        }
    });

    useEffect (() => {
        document.addEventListener('keydown', keyEvent, false);
        COTRN01_COTRN1AStore.renderStyle(parsedData  ,TRNNAMERef ,TITLE01Ref ,CURDATERef ,PGMNAMERef ,TITLE02Ref ,CURTIMERef ,TRNIDINRef ,TRNIDRef ,CARDNUMRef ,TTYPCDRef ,TCATCDRef ,TRNSRCRef ,TDESCRef ,TRNAMTRef ,TORIGDTRef ,TPROCDTRef ,MIDRef ,MNAMERef ,MCITYRef ,MZIPRef ,ERRMSGRef);
         TRNIDINRef.current.focus();
        return () => {
            document.removeEventListener('keydown', keyEvent, false);
        }
    }, []);

    const render = useMemo(() => {
        if(systemDto.immediate === true) {
          COTRN01_COTRN1AStore.simpleRequest(systemDto, 13, serverUrl, history);
        } else {
            if(parsedData !== null) {
              SystemStore.setToggle(true);
              COTRN01_COTRN1AStore.render(parsedData);
            }
        }

    }, [location, systemDto.immediate]);

    const notificationHandleClose = () => {
        SystemStore.setToggle(false);
    };

    return (
        <>
            {render}
            <COTRN01_COTRN1AView
                location = {location}
                onKeyPressedTRNIDIN = { onKeyPressedTRNIDIN }
                TRNNAMERef = { TRNNAMERef }
                TITLE01Ref = { TITLE01Ref }
                CURDATERef = { CURDATERef }
                PGMNAMERef = { PGMNAMERef }
                TITLE02Ref = { TITLE02Ref }
                CURTIMERef = { CURTIMERef }
                TRNIDINRef = { TRNIDINRef }
                TRNIDRef = { TRNIDRef }
                CARDNUMRef = { CARDNUMRef }
                TTYPCDRef = { TTYPCDRef }
                TCATCDRef = { TCATCDRef }
                TRNSRCRef = { TRNSRCRef }
                TDESCRef = { TDESCRef }
                TRNAMTRef = { TRNAMTRef }
                TORIGDTRef = { TORIGDTRef }
                TPROCDTRef = { TPROCDTRef }
                MIDRef = { MIDRef }
                MNAMERef = { MNAMERef }
                MCITYRef = { MCITYRef }
                MZIPRef = { MZIPRef }
                ERRMSGRef = { ERRMSGRef }
            />
            {systemDto.notification ? <Notification data = {systemDto.notification} toggle={SystemStore.toggle}
            handleClose = {notificationHandleClose}/> : null}
        </>
    );

});
export default COTRN01_COTRN1A;

