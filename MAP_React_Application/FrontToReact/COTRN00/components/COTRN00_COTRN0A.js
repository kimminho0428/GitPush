import React, {useCallback, useEffect, useLayoutEffect, useMemo, useRef, useState} from 'react';
import COTRN00_COTRN0AView from "./COTRN00_COTRN0AView";
import {observer} from "mobx-react";
import useStore from "../store/UseStore";
import Notification from "../runtime/component/notification/Notification";

const COTRN00_COTRN0A = observer(({history, location, children}) => {

    const serverUrl = location.state.url;
    const data = location.state.response;
    const parsedData = data.COTRN0AO;
    const systemDto = data.systemDto;

    const { COTRN00_COTRN0AStore, SystemStore } = useStore();

    const TRNNAMERef = useRef(COTRN00_COTRN0AStore.TRNNAME);
    const TITLE01Ref = useRef(COTRN00_COTRN0AStore.TITLE01);
    const CURDATERef = useRef(COTRN00_COTRN0AStore.CURDATE);
    const PGMNAMERef = useRef(COTRN00_COTRN0AStore.PGMNAME);
    const TITLE02Ref = useRef(COTRN00_COTRN0AStore.TITLE02);
    const CURTIMERef = useRef(COTRN00_COTRN0AStore.CURTIME);
    const PAGENUMRef = useRef(COTRN00_COTRN0AStore.PAGENUM);
    const TRNIDINRef = useRef(COTRN00_COTRN0AStore.TRNIDIN);
    const SEL0001Ref = useRef(COTRN00_COTRN0AStore.SEL0001);
    const TRNID01Ref = useRef(COTRN00_COTRN0AStore.TRNID01);
    const TDATE01Ref = useRef(COTRN00_COTRN0AStore.TDATE01);
    const TDESC01Ref = useRef(COTRN00_COTRN0AStore.TDESC01);
    const TAMT001Ref = useRef(COTRN00_COTRN0AStore.TAMT001);
    const SEL0002Ref = useRef(COTRN00_COTRN0AStore.SEL0002);
    const TRNID02Ref = useRef(COTRN00_COTRN0AStore.TRNID02);
    const TDATE02Ref = useRef(COTRN00_COTRN0AStore.TDATE02);
    const TDESC02Ref = useRef(COTRN00_COTRN0AStore.TDESC02);
    const TAMT002Ref = useRef(COTRN00_COTRN0AStore.TAMT002);
    const SEL0003Ref = useRef(COTRN00_COTRN0AStore.SEL0003);
    const TRNID03Ref = useRef(COTRN00_COTRN0AStore.TRNID03);
    const TDATE03Ref = useRef(COTRN00_COTRN0AStore.TDATE03);
    const TDESC03Ref = useRef(COTRN00_COTRN0AStore.TDESC03);
    const TAMT003Ref = useRef(COTRN00_COTRN0AStore.TAMT003);
    const SEL0004Ref = useRef(COTRN00_COTRN0AStore.SEL0004);
    const TRNID04Ref = useRef(COTRN00_COTRN0AStore.TRNID04);
    const TDATE04Ref = useRef(COTRN00_COTRN0AStore.TDATE04);
    const TDESC04Ref = useRef(COTRN00_COTRN0AStore.TDESC04);
    const TAMT004Ref = useRef(COTRN00_COTRN0AStore.TAMT004);
    const SEL0005Ref = useRef(COTRN00_COTRN0AStore.SEL0005);
    const TRNID05Ref = useRef(COTRN00_COTRN0AStore.TRNID05);
    const TDATE05Ref = useRef(COTRN00_COTRN0AStore.TDATE05);
    const TDESC05Ref = useRef(COTRN00_COTRN0AStore.TDESC05);
    const TAMT005Ref = useRef(COTRN00_COTRN0AStore.TAMT005);
    const SEL0006Ref = useRef(COTRN00_COTRN0AStore.SEL0006);
    const TRNID06Ref = useRef(COTRN00_COTRN0AStore.TRNID06);
    const TDATE06Ref = useRef(COTRN00_COTRN0AStore.TDATE06);
    const TDESC06Ref = useRef(COTRN00_COTRN0AStore.TDESC06);
    const TAMT006Ref = useRef(COTRN00_COTRN0AStore.TAMT006);
    const SEL0007Ref = useRef(COTRN00_COTRN0AStore.SEL0007);
    const TRNID07Ref = useRef(COTRN00_COTRN0AStore.TRNID07);
    const TDATE07Ref = useRef(COTRN00_COTRN0AStore.TDATE07);
    const TDESC07Ref = useRef(COTRN00_COTRN0AStore.TDESC07);
    const TAMT007Ref = useRef(COTRN00_COTRN0AStore.TAMT007);
    const SEL0008Ref = useRef(COTRN00_COTRN0AStore.SEL0008);
    const TRNID08Ref = useRef(COTRN00_COTRN0AStore.TRNID08);
    const TDATE08Ref = useRef(COTRN00_COTRN0AStore.TDATE08);
    const TDESC08Ref = useRef(COTRN00_COTRN0AStore.TDESC08);
    const TAMT008Ref = useRef(COTRN00_COTRN0AStore.TAMT008);
    const SEL0009Ref = useRef(COTRN00_COTRN0AStore.SEL0009);
    const TRNID09Ref = useRef(COTRN00_COTRN0AStore.TRNID09);
    const TDATE09Ref = useRef(COTRN00_COTRN0AStore.TDATE09);
    const TDESC09Ref = useRef(COTRN00_COTRN0AStore.TDESC09);
    const TAMT009Ref = useRef(COTRN00_COTRN0AStore.TAMT009);
    const SEL0010Ref = useRef(COTRN00_COTRN0AStore.SEL0010);
    const TRNID10Ref = useRef(COTRN00_COTRN0AStore.TRNID10);
    const TDATE10Ref = useRef(COTRN00_COTRN0AStore.TDATE10);
    const TDESC10Ref = useRef(COTRN00_COTRN0AStore.TDESC10);
    const TAMT010Ref = useRef(COTRN00_COTRN0AStore.TAMT010);
    const ERRMSGRef = useRef(COTRN00_COTRN0AStore.ERRMSG);



    const onKeyPressedTRNIDIN = event => {
      COTRN00_COTRN0AStore.setTRNIDIN(event.target.value);
      if(event.target.value.length >= 16.0) {
        SEL0001Ref.current.focus();
      }
    }
    const onKeyPressedSEL0001 = event => {
      COTRN00_COTRN0AStore.setSEL0001(event.target.value);
      if(event.target.value.length >= 1.0) {
        SEL0002Ref.current.focus();
      }
    }
    const onKeyPressedSEL0002 = event => {
      COTRN00_COTRN0AStore.setSEL0002(event.target.value);
      if(event.target.value.length >= 1.0) {
        SEL0003Ref.current.focus();
      }
    }
    const onKeyPressedSEL0003 = event => {
      COTRN00_COTRN0AStore.setSEL0003(event.target.value);
      if(event.target.value.length >= 1.0) {
        SEL0004Ref.current.focus();
      }
    }
    const onKeyPressedSEL0004 = event => {
      COTRN00_COTRN0AStore.setSEL0004(event.target.value);
      if(event.target.value.length >= 1.0) {
        SEL0005Ref.current.focus();
      }
    }
    const onKeyPressedSEL0005 = event => {
      COTRN00_COTRN0AStore.setSEL0005(event.target.value);
      if(event.target.value.length >= 1.0) {
        SEL0006Ref.current.focus();
      }
    }
    const onKeyPressedSEL0006 = event => {
      COTRN00_COTRN0AStore.setSEL0006(event.target.value);
      if(event.target.value.length >= 1.0) {
        SEL0007Ref.current.focus();
      }
    }
    const onKeyPressedSEL0007 = event => {
      COTRN00_COTRN0AStore.setSEL0007(event.target.value);
      if(event.target.value.length >= 1.0) {
        SEL0008Ref.current.focus();
      }
    }
    const onKeyPressedSEL0008 = event => {
      COTRN00_COTRN0AStore.setSEL0008(event.target.value);
      if(event.target.value.length >= 1.0) {
        SEL0009Ref.current.focus();
      }
    }
    const onKeyPressedSEL0009 = event => {
      COTRN00_COTRN0AStore.setSEL0009(event.target.value);
      if(event.target.value.length >= 1.0) {
        SEL0010Ref.current.focus();
      }
    }
    const onKeyPressedSEL0010 = event => {
      COTRN00_COTRN0AStore.setSEL0010(event.target.value);
      if(event.target.value.length >= 1.0) {
        TRNIDINRef.current.focus();
      }
    }


    const keyEvent = useCallback((event) => {
        if(event.keyCode === 13) {
            COTRN00_COTRN0AStore.request(systemDto, event.keyCode, serverUrl, history, SEL0001Ref, SEL0002Ref, SEL0003Ref, SEL0004Ref, SEL0005Ref, SEL0006Ref, SEL0007Ref, SEL0008Ref, SEL0009Ref, SEL0010Ref, TRNIDINRef);
        } else if(event.keyCode >= 112 && event.keyCode <= 123) {
            event.preventDefault();
            COTRN00_COTRN0AStore.request(systemDto, event.keyCode, serverUrl, history, SEL0001Ref, SEL0002Ref, SEL0003Ref, SEL0004Ref, SEL0005Ref, SEL0006Ref, SEL0007Ref, SEL0008Ref, SEL0009Ref, SEL0010Ref, TRNIDINRef);
        }
    });

    useEffect (() => {
        document.addEventListener('keydown', keyEvent, false);
        COTRN00_COTRN0AStore.renderStyle(parsedData  ,TRNNAMERef ,TITLE01Ref ,CURDATERef ,PGMNAMERef ,TITLE02Ref ,CURTIMERef ,PAGENUMRef ,TRNIDINRef ,SEL0001Ref ,TRNID01Ref ,TDATE01Ref ,TDESC01Ref ,TAMT001Ref ,SEL0002Ref ,TRNID02Ref ,TDATE02Ref ,TDESC02Ref ,TAMT002Ref ,SEL0003Ref ,TRNID03Ref ,TDATE03Ref ,TDESC03Ref ,TAMT003Ref ,SEL0004Ref ,TRNID04Ref ,TDATE04Ref ,TDESC04Ref ,TAMT004Ref ,SEL0005Ref ,TRNID05Ref ,TDATE05Ref ,TDESC05Ref ,TAMT005Ref ,SEL0006Ref ,TRNID06Ref ,TDATE06Ref ,TDESC06Ref ,TAMT006Ref ,SEL0007Ref ,TRNID07Ref ,TDATE07Ref ,TDESC07Ref ,TAMT007Ref ,SEL0008Ref ,TRNID08Ref ,TDATE08Ref ,TDESC08Ref ,TAMT008Ref ,SEL0009Ref ,TRNID09Ref ,TDATE09Ref ,TDESC09Ref ,TAMT009Ref ,SEL0010Ref ,TRNID10Ref ,TDATE10Ref ,TDESC10Ref ,TAMT010Ref ,ERRMSGRef);
         TRNIDINRef.current.focus();
        return () => {
            document.removeEventListener('keydown', keyEvent, false);
        }
    }, []);

    const render = useMemo(() => {
        if(systemDto.immediate === true) {
          COTRN00_COTRN0AStore.simpleRequest(systemDto, 13, serverUrl, history);
        } else {
            if(parsedData !== null) {
              SystemStore.setToggle(true);
              COTRN00_COTRN0AStore.render(parsedData);
            }
        }

    }, [location, systemDto.immediate]);

    const notificationHandleClose = () => {
        SystemStore.setToggle(false);
    };

    return (
        <>
            {render}
            <COTRN00_COTRN0AView
                location = {location}
                onKeyPressedSEL0001 = { onKeyPressedSEL0001 }
                onKeyPressedSEL0002 = { onKeyPressedSEL0002 }
                onKeyPressedSEL0003 = { onKeyPressedSEL0003 }
                onKeyPressedSEL0004 = { onKeyPressedSEL0004 }
                onKeyPressedSEL0005 = { onKeyPressedSEL0005 }
                onKeyPressedSEL0006 = { onKeyPressedSEL0006 }
                onKeyPressedSEL0007 = { onKeyPressedSEL0007 }
                onKeyPressedSEL0008 = { onKeyPressedSEL0008 }
                onKeyPressedSEL0009 = { onKeyPressedSEL0009 }
                onKeyPressedSEL0010 = { onKeyPressedSEL0010 }
                onKeyPressedTRNIDIN = { onKeyPressedTRNIDIN }
                TRNNAMERef = { TRNNAMERef }
                TITLE01Ref = { TITLE01Ref }
                CURDATERef = { CURDATERef }
                PGMNAMERef = { PGMNAMERef }
                TITLE02Ref = { TITLE02Ref }
                CURTIMERef = { CURTIMERef }
                PAGENUMRef = { PAGENUMRef }
                TRNIDINRef = { TRNIDINRef }
                SEL0001Ref = { SEL0001Ref }
                TRNID01Ref = { TRNID01Ref }
                TDATE01Ref = { TDATE01Ref }
                TDESC01Ref = { TDESC01Ref }
                TAMT001Ref = { TAMT001Ref }
                SEL0002Ref = { SEL0002Ref }
                TRNID02Ref = { TRNID02Ref }
                TDATE02Ref = { TDATE02Ref }
                TDESC02Ref = { TDESC02Ref }
                TAMT002Ref = { TAMT002Ref }
                SEL0003Ref = { SEL0003Ref }
                TRNID03Ref = { TRNID03Ref }
                TDATE03Ref = { TDATE03Ref }
                TDESC03Ref = { TDESC03Ref }
                TAMT003Ref = { TAMT003Ref }
                SEL0004Ref = { SEL0004Ref }
                TRNID04Ref = { TRNID04Ref }
                TDATE04Ref = { TDATE04Ref }
                TDESC04Ref = { TDESC04Ref }
                TAMT004Ref = { TAMT004Ref }
                SEL0005Ref = { SEL0005Ref }
                TRNID05Ref = { TRNID05Ref }
                TDATE05Ref = { TDATE05Ref }
                TDESC05Ref = { TDESC05Ref }
                TAMT005Ref = { TAMT005Ref }
                SEL0006Ref = { SEL0006Ref }
                TRNID06Ref = { TRNID06Ref }
                TDATE06Ref = { TDATE06Ref }
                TDESC06Ref = { TDESC06Ref }
                TAMT006Ref = { TAMT006Ref }
                SEL0007Ref = { SEL0007Ref }
                TRNID07Ref = { TRNID07Ref }
                TDATE07Ref = { TDATE07Ref }
                TDESC07Ref = { TDESC07Ref }
                TAMT007Ref = { TAMT007Ref }
                SEL0008Ref = { SEL0008Ref }
                TRNID08Ref = { TRNID08Ref }
                TDATE08Ref = { TDATE08Ref }
                TDESC08Ref = { TDESC08Ref }
                TAMT008Ref = { TAMT008Ref }
                SEL0009Ref = { SEL0009Ref }
                TRNID09Ref = { TRNID09Ref }
                TDATE09Ref = { TDATE09Ref }
                TDESC09Ref = { TDESC09Ref }
                TAMT009Ref = { TAMT009Ref }
                SEL0010Ref = { SEL0010Ref }
                TRNID10Ref = { TRNID10Ref }
                TDATE10Ref = { TDATE10Ref }
                TDESC10Ref = { TDESC10Ref }
                TAMT010Ref = { TAMT010Ref }
                ERRMSGRef = { ERRMSGRef }
            />
            {systemDto.notification ? <Notification data = {systemDto.notification} toggle={SystemStore.toggle}
            handleClose = {notificationHandleClose}/> : null}
        </>
    );

});
export default COTRN00_COTRN0A;

