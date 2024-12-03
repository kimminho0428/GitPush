import React from 'react';
import {observable} from "mobx";
import { COBIL0AI } from "../data/COBIL00_COBIL0AInputDto";
import RestPost from "../runtime/component/io/RestPost";
import {makeJson} from "../runtime/JsonFactory";
import COBIL00_COBIL0AValidation from "./COBIL00_COBIL0AValidation";
import {changeColorFlag, changeHighlight, convertPressedKey} from "../runtime/KeyEvent";

const COBIL00_COBIL0AStore = observable({
      TRNNAME: "",
      TITLE01: "",
      CURDATE: "",
      PGMNAME: "",
      TITLE02: "",
      CURTIME: "",
      ACTIDIN: "",
      CURBAL: "",
      CONFIRM: "",
      ERRMSG: "",

      setACTIDIN(ACTIDIN) {
        this.ACTIDIN = ACTIDIN
      },
      setCONFIRM(CONFIRM) {
        this.CONFIRM = CONFIRM
      },

    render(parsedData) {
      if (parsedData == null) {
          this.TRNNAME = "";
          this.TITLE01 = "";
          this.CURDATE = "";
          this.PGMNAME = "";
          this.TITLE02 = "";
          this.CURTIME = "";
          this.ACTIDIN = "";
          this.CURBAL = "";
          this.CONFIRM = "";
          this.ERRMSG = "";
      }
        this.TRNNAME = parsedData.trnnameo.trim() === '' ? '' : parsedData.trnnameo;
        this.ERRMSG = parsedData.errmsgo.trim() === '' ? '' : parsedData.errmsgo;
        this.CURTIME = parsedData.curtimeo.trim() === '' ? '' : parsedData.curtimeo;
        this.CURBAL = parsedData.curbalo.trim() === '' ? '' : parsedData.curbalo;
        this.TITLE01 = parsedData.title01o.trim() === '' ? '' : parsedData.title01o;
        this.ACTIDIN = parsedData.actidino.trim() === '' ? '' : parsedData.actidino;
        this.TITLE02 = parsedData.title02o.trim() === '' ? '' : parsedData.title02o;
        this.CONFIRM = parsedData.confirmo.trim() === '' ? '' : parsedData.confirmo;
        this.PGMNAME = parsedData.pgmnameo.trim() === '' ? '' : parsedData.pgmnameo;
        this.CURDATE = parsedData.curdateo.trim() === '' ? '' : parsedData.curdateo;
    },

    renderStyle(parsedData, TRNNAMERef , TITLE01Ref , CURDATERef , PGMNAMERef , TITLE02Ref , CURTIMERef , ACTIDINRef , CURBALRef , CONFIRMRef , ERRMSGRef ) {
      if(parsedData !== null) {
          TRNNAMERef.current.style.color = changeColorFlag(parsedData.trnnamec);
          ERRMSGRef.current.style.color = changeColorFlag(parsedData.errmsgc);
          CURTIMERef.current.style.color = changeColorFlag(parsedData.curtimec);
          CURBALRef.current.style.color = changeColorFlag(parsedData.curbalc);
          TITLE01Ref.current.style.color = changeColorFlag(parsedData.title01c);
          ACTIDINRef.current.style.color = changeColorFlag(parsedData.actidinc);
          TITLE02Ref.current.style.color = changeColorFlag(parsedData.title02c);
          CONFIRMRef.current.style.color = changeColorFlag(parsedData.confirmc);
          PGMNAMERef.current.style.color = changeColorFlag(parsedData.pgmnamec);
          CURDATERef.current.style.color = changeColorFlag(parsedData.curdatec);

          changeHighlight(TRNNAMERef, parsedData.trnnameh);
          changeHighlight(ERRMSGRef, parsedData.errmsgh);
          changeHighlight(CURTIMERef, parsedData.curtimeh);
          changeHighlight(CURBALRef, parsedData.curbalh);
          changeHighlight(TITLE01Ref, parsedData.title01h);
          changeHighlight(ACTIDINRef, parsedData.actidinh);
          changeHighlight(TITLE02Ref, parsedData.title02h);
          changeHighlight(CONFIRMRef, parsedData.confirmh);
          changeHighlight(PGMNAMERef, parsedData.pgmnameh);
          changeHighlight(CURDATERef, parsedData.curdateh);
      }
    },

    request(systemDto, keyCode, serverUrl, history, ACTIDINRef, CONFIRMRef) {
        if(COBIL00_COBIL0AValidation({  ACTIDIN : this.ACTIDIN, ACTIDINRef : ACTIDINRef, CONFIRM : this.CONFIRM, CONFIRMRef : CONFIRMRef, }) === false) {
            return;
        }

        COBIL0AI.curbali = this.CURBAL;
        COBIL0AI.curball = this.CURBAL.length;
        COBIL0AI.curdatei = this.CURDATE;
        COBIL0AI.curdatel = this.CURDATE.length;
        COBIL0AI.curtimei = this.CURTIME;
        COBIL0AI.curtimel = this.CURTIME.length;
        COBIL0AI.errmsgi = this.ERRMSG;
        COBIL0AI.errmsgl = this.ERRMSG.length;
        COBIL0AI.pgmnamei = this.PGMNAME;
        COBIL0AI.pgmnamel = this.PGMNAME.length;
        COBIL0AI.title01i = this.TITLE01;
        COBIL0AI.title01l = this.TITLE01.length;
        COBIL0AI.title02i = this.TITLE02;
        COBIL0AI.title02l = this.TITLE02.length;
        COBIL0AI.trnnamei = this.TRNNAME;
        COBIL0AI.trnnamel = this.TRNNAME.length;
        COBIL0AI.actidini = this.ACTIDIN;
        COBIL0AI.actidinl = this.ACTIDIN.length;
        COBIL0AI.confirmi = this.CONFIRM;
        COBIL0AI.confirml = this.CONFIRM.length;

        let request = makeJson("userId", convertPressedKey(keyCode));
        request.COBIL0AI = COBIL0AI;
        request.systemDto.nextTransaction = systemDto.nextTransaction;
        request.systemDto.serviceId = systemDto.nextTransaction;
        RestPost(history, request, serverUrl, "COBIL00_COBIL0A");
    },

    simpleRequest(systemDto, keyCode, serverUrl, history) {
        let request = makeJson("userId", convertPressedKey(keyCode));
        request.systemDto.nextTransaction = systemDto.nextTransaction;
        request.systemDto.serviceId = systemDto.nextTransaction;

        console.log("simple request [next tx:]" + request.systemDto.nextTransaction);
        RestPost(history, request, serverUrl, "COBIL00_COBIL0A");
    }
});

export default COBIL00_COBIL0AStore;

