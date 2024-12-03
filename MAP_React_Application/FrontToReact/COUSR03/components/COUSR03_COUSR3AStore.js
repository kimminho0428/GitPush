import React from 'react';
import {observable} from "mobx";
import { COUSR3AI } from "../data/COUSR03_COUSR3AInputDto";
import RestPost from "../runtime/component/io/RestPost";
import {makeJson} from "../runtime/JsonFactory";
import COUSR03_COUSR3AValidation from "./COUSR03_COUSR3AValidation";
import {changeColorFlag, changeHighlight, convertPressedKey} from "../runtime/KeyEvent";

const COUSR03_COUSR3AStore = observable({
      TRNNAME: "",
      TITLE01: "",
      CURDATE: "",
      PGMNAME: "",
      TITLE02: "",
      CURTIME: "",
      USRIDIN: "",
      FNAME: "",
      LNAME: "",
      USRTYPE: "",
      ERRMSG: "",

      setUSRIDIN(USRIDIN) {
        this.USRIDIN = USRIDIN
      },

    render(parsedData) {
      if (parsedData == null) {
          this.TRNNAME = "";
          this.TITLE01 = "";
          this.CURDATE = "";
          this.PGMNAME = "";
          this.TITLE02 = "";
          this.CURTIME = "";
          this.USRIDIN = "";
          this.FNAME = "";
          this.LNAME = "";
          this.USRTYPE = "";
          this.ERRMSG = "";
      }
        this.USRTYPE = parsedData.usrtypeo.trim() === '' ? '' : parsedData.usrtypeo;
        this.TRNNAME = parsedData.trnnameo.trim() === '' ? '' : parsedData.trnnameo;
        this.LNAME = parsedData.lnameo.trim() === '' ? '' : parsedData.lnameo;
        this.ERRMSG = parsedData.errmsgo.trim() === '' ? '' : parsedData.errmsgo;
        this.CURTIME = parsedData.curtimeo.trim() === '' ? '' : parsedData.curtimeo;
        this.TITLE01 = parsedData.title01o.trim() === '' ? '' : parsedData.title01o;
        this.TITLE02 = parsedData.title02o.trim() === '' ? '' : parsedData.title02o;
        this.PGMNAME = parsedData.pgmnameo.trim() === '' ? '' : parsedData.pgmnameo;
        this.USRIDIN = parsedData.usridino.trim() === '' ? '' : parsedData.usridino;
        this.CURDATE = parsedData.curdateo.trim() === '' ? '' : parsedData.curdateo;
        this.FNAME = parsedData.fnameo.trim() === '' ? '' : parsedData.fnameo;
    },

    renderStyle(parsedData, TRNNAMERef , TITLE01Ref , CURDATERef , PGMNAMERef , TITLE02Ref , CURTIMERef , USRIDINRef , FNAMERef , LNAMERef , USRTYPERef , ERRMSGRef ) {
      if(parsedData !== null) {
          USRTYPERef.current.style.color = changeColorFlag(parsedData.usrtypec);
          TRNNAMERef.current.style.color = changeColorFlag(parsedData.trnnamec);
          LNAMERef.current.style.color = changeColorFlag(parsedData.lnamec);
          ERRMSGRef.current.style.color = changeColorFlag(parsedData.errmsgc);
          CURTIMERef.current.style.color = changeColorFlag(parsedData.curtimec);
          TITLE01Ref.current.style.color = changeColorFlag(parsedData.title01c);
          TITLE02Ref.current.style.color = changeColorFlag(parsedData.title02c);
          PGMNAMERef.current.style.color = changeColorFlag(parsedData.pgmnamec);
          USRIDINRef.current.style.color = changeColorFlag(parsedData.usridinc);
          CURDATERef.current.style.color = changeColorFlag(parsedData.curdatec);
          FNAMERef.current.style.color = changeColorFlag(parsedData.fnamec);

          changeHighlight(USRTYPERef, parsedData.usrtypeh);
          changeHighlight(TRNNAMERef, parsedData.trnnameh);
          changeHighlight(LNAMERef, parsedData.lnameh);
          changeHighlight(ERRMSGRef, parsedData.errmsgh);
          changeHighlight(CURTIMERef, parsedData.curtimeh);
          changeHighlight(TITLE01Ref, parsedData.title01h);
          changeHighlight(TITLE02Ref, parsedData.title02h);
          changeHighlight(PGMNAMERef, parsedData.pgmnameh);
          changeHighlight(USRIDINRef, parsedData.usridinh);
          changeHighlight(CURDATERef, parsedData.curdateh);
          changeHighlight(FNAMERef, parsedData.fnameh);
      }
    },

    request(systemDto, keyCode, serverUrl, history, USRIDINRef) {
        if(COUSR03_COUSR3AValidation({  USRIDIN : this.USRIDIN, USRIDINRef : USRIDINRef, }) === false) {
            return;
        }

        COUSR3AI.curdatei = this.CURDATE;
        COUSR3AI.curdatel = this.CURDATE.length;
        COUSR3AI.curtimei = this.CURTIME;
        COUSR3AI.curtimel = this.CURTIME.length;
        COUSR3AI.errmsgi = this.ERRMSG;
        COUSR3AI.errmsgl = this.ERRMSG.length;
        COUSR3AI.fnamei = this.FNAME;
        COUSR3AI.fnamel = this.FNAME.length;
        COUSR3AI.lnamei = this.LNAME;
        COUSR3AI.lnamel = this.LNAME.length;
        COUSR3AI.pgmnamei = this.PGMNAME;
        COUSR3AI.pgmnamel = this.PGMNAME.length;
        COUSR3AI.title01i = this.TITLE01;
        COUSR3AI.title01l = this.TITLE01.length;
        COUSR3AI.title02i = this.TITLE02;
        COUSR3AI.title02l = this.TITLE02.length;
        COUSR3AI.trnnamei = this.TRNNAME;
        COUSR3AI.trnnamel = this.TRNNAME.length;
        COUSR3AI.usrtypei = this.USRTYPE;
        COUSR3AI.usrtypel = this.USRTYPE.length;
        COUSR3AI.usridini = this.USRIDIN;
        COUSR3AI.usridinl = this.USRIDIN.length;

        let request = makeJson("userId", convertPressedKey(keyCode));
        request.COUSR3AI = COUSR3AI;
        request.systemDto.nextTransaction = systemDto.nextTransaction;
        request.systemDto.serviceId = systemDto.nextTransaction;
        RestPost(history, request, serverUrl, "COUSR03_COUSR3A");
    },

    simpleRequest(systemDto, keyCode, serverUrl, history) {
        let request = makeJson("userId", convertPressedKey(keyCode));
        request.systemDto.nextTransaction = systemDto.nextTransaction;
        request.systemDto.serviceId = systemDto.nextTransaction;

        console.log("simple request [next tx:]" + request.systemDto.nextTransaction);
        RestPost(history, request, serverUrl, "COUSR03_COUSR3A");
    }
});

export default COUSR03_COUSR3AStore;

