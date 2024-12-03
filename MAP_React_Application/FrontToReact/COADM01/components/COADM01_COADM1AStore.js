import React from 'react';
import {observable} from "mobx";
import { COADM1AI } from "../data/COADM01_COADM1AInputDto";
import RestPost from "../runtime/component/io/RestPost";
import {makeJson} from "../runtime/JsonFactory";
import COADM01_COADM1AValidation from "./COADM01_COADM1AValidation";
import {changeColorFlag, changeHighlight, convertPressedKey} from "../runtime/KeyEvent";

const COADM01_COADM1AStore = observable({
      TRNNAME: "",
      TITLE01: "",
      CURDATE: "",
      PGMNAME: "",
      TITLE02: "",
      CURTIME: "",
      OPTN001: "",
      OPTN002: "",
      OPTN003: "",
      OPTN004: "",
      OPTN005: "",
      OPTN006: "",
      OPTN007: "",
      OPTN008: "",
      OPTN009: "",
      OPTN010: "",
      OPTN011: "",
      OPTN012: "",
      OPTION: "",
      ERRMSG: "",

      setOPTION(OPTION) {
        this.OPTION = OPTION
      },

    render(parsedData) {
      if (parsedData == null) {
          this.TRNNAME = "";
          this.TITLE01 = "";
          this.CURDATE = "";
          this.PGMNAME = "";
          this.TITLE02 = "";
          this.CURTIME = "";
          this.OPTN001 = "";
          this.OPTN002 = "";
          this.OPTN003 = "";
          this.OPTN004 = "";
          this.OPTN005 = "";
          this.OPTN006 = "";
          this.OPTN007 = "";
          this.OPTN008 = "";
          this.OPTN009 = "";
          this.OPTN010 = "";
          this.OPTN011 = "";
          this.OPTN012 = "";
          this.OPTION = "";
          this.ERRMSG = "";
      }
        this.OPTN002 = parsedData.optn002o.trim() === '' ? '' : parsedData.optn002o;
        this.OPTN001 = parsedData.optn001o.trim() === '' ? '' : parsedData.optn001o;
        this.OPTN012 = parsedData.optn012o.trim() === '' ? '' : parsedData.optn012o;
        this.OPTN011 = parsedData.optn011o.trim() === '' ? '' : parsedData.optn011o;
        this.OPTN010 = parsedData.optn010o.trim() === '' ? '' : parsedData.optn010o;
        this.OPTN006 = parsedData.optn006o.trim() === '' ? '' : parsedData.optn006o;
        this.OPTION = parsedData.optiono.trim() === '' ? '' : parsedData.optiono;
        this.OPTN005 = parsedData.optn005o.trim() === '' ? '' : parsedData.optn005o;
        this.OPTN004 = parsedData.optn004o.trim() === '' ? '' : parsedData.optn004o;
        this.OPTN003 = parsedData.optn003o.trim() === '' ? '' : parsedData.optn003o;
        this.OPTN009 = parsedData.optn009o.trim() === '' ? '' : parsedData.optn009o;
        this.OPTN008 = parsedData.optn008o.trim() === '' ? '' : parsedData.optn008o;
        this.OPTN007 = parsedData.optn007o.trim() === '' ? '' : parsedData.optn007o;
        this.TRNNAME = parsedData.trnnameo.trim() === '' ? '' : parsedData.trnnameo;
        this.ERRMSG = parsedData.errmsgo.trim() === '' ? '' : parsedData.errmsgo;
        this.CURTIME = parsedData.curtimeo.trim() === '' ? '' : parsedData.curtimeo;
        this.TITLE01 = parsedData.title01o.trim() === '' ? '' : parsedData.title01o;
        this.TITLE02 = parsedData.title02o.trim() === '' ? '' : parsedData.title02o;
        this.PGMNAME = parsedData.pgmnameo.trim() === '' ? '' : parsedData.pgmnameo;
        this.CURDATE = parsedData.curdateo.trim() === '' ? '' : parsedData.curdateo;
    },

    renderStyle(parsedData, TRNNAMERef , TITLE01Ref , CURDATERef , PGMNAMERef , TITLE02Ref , CURTIMERef , OPTN001Ref , OPTN002Ref , OPTN003Ref , OPTN004Ref , OPTN005Ref , OPTN006Ref , OPTN007Ref , OPTN008Ref , OPTN009Ref , OPTN010Ref , OPTN011Ref , OPTN012Ref , OPTIONRef , ERRMSGRef ) {
      if(parsedData !== null) {
          OPTN002Ref.current.style.color = changeColorFlag(parsedData.optn002c);
          OPTN001Ref.current.style.color = changeColorFlag(parsedData.optn001c);
          OPTN012Ref.current.style.color = changeColorFlag(parsedData.optn012c);
          OPTN011Ref.current.style.color = changeColorFlag(parsedData.optn011c);
          OPTN010Ref.current.style.color = changeColorFlag(parsedData.optn010c);
          OPTN006Ref.current.style.color = changeColorFlag(parsedData.optn006c);
          OPTIONRef.current.style.color = changeColorFlag(parsedData.optionc);
          OPTN005Ref.current.style.color = changeColorFlag(parsedData.optn005c);
          OPTN004Ref.current.style.color = changeColorFlag(parsedData.optn004c);
          OPTN003Ref.current.style.color = changeColorFlag(parsedData.optn003c);
          OPTN009Ref.current.style.color = changeColorFlag(parsedData.optn009c);
          OPTN008Ref.current.style.color = changeColorFlag(parsedData.optn008c);
          OPTN007Ref.current.style.color = changeColorFlag(parsedData.optn007c);
          TRNNAMERef.current.style.color = changeColorFlag(parsedData.trnnamec);
          ERRMSGRef.current.style.color = changeColorFlag(parsedData.errmsgc);
          CURTIMERef.current.style.color = changeColorFlag(parsedData.curtimec);
          TITLE01Ref.current.style.color = changeColorFlag(parsedData.title01c);
          TITLE02Ref.current.style.color = changeColorFlag(parsedData.title02c);
          PGMNAMERef.current.style.color = changeColorFlag(parsedData.pgmnamec);
          CURDATERef.current.style.color = changeColorFlag(parsedData.curdatec);

          changeHighlight(OPTN002Ref, parsedData.optn002h);
          changeHighlight(OPTN001Ref, parsedData.optn001h);
          changeHighlight(OPTN012Ref, parsedData.optn012h);
          changeHighlight(OPTN011Ref, parsedData.optn011h);
          changeHighlight(OPTN010Ref, parsedData.optn010h);
          changeHighlight(OPTN006Ref, parsedData.optn006h);
          changeHighlight(OPTIONRef, parsedData.optionh);
          changeHighlight(OPTN005Ref, parsedData.optn005h);
          changeHighlight(OPTN004Ref, parsedData.optn004h);
          changeHighlight(OPTN003Ref, parsedData.optn003h);
          changeHighlight(OPTN009Ref, parsedData.optn009h);
          changeHighlight(OPTN008Ref, parsedData.optn008h);
          changeHighlight(OPTN007Ref, parsedData.optn007h);
          changeHighlight(TRNNAMERef, parsedData.trnnameh);
          changeHighlight(ERRMSGRef, parsedData.errmsgh);
          changeHighlight(CURTIMERef, parsedData.curtimeh);
          changeHighlight(TITLE01Ref, parsedData.title01h);
          changeHighlight(TITLE02Ref, parsedData.title02h);
          changeHighlight(PGMNAMERef, parsedData.pgmnameh);
          changeHighlight(CURDATERef, parsedData.curdateh);
      }
    },

    request(systemDto, keyCode, serverUrl, history, OPTIONRef) {
        if(COADM01_COADM1AValidation({  OPTION : this.OPTION, OPTIONRef : OPTIONRef, }) === false) {
            return;
        }

        COADM1AI.curdatei = this.CURDATE;
        COADM1AI.curdatel = this.CURDATE.length;
        COADM1AI.curtimei = this.CURTIME;
        COADM1AI.curtimel = this.CURTIME.length;
        COADM1AI.errmsgi = this.ERRMSG;
        COADM1AI.errmsgl = this.ERRMSG.length;
        COADM1AI.optn001i = this.OPTN001;
        COADM1AI.optn001l = this.OPTN001.length;
        COADM1AI.optn002i = this.OPTN002;
        COADM1AI.optn002l = this.OPTN002.length;
        COADM1AI.optn003i = this.OPTN003;
        COADM1AI.optn003l = this.OPTN003.length;
        COADM1AI.optn004i = this.OPTN004;
        COADM1AI.optn004l = this.OPTN004.length;
        COADM1AI.optn005i = this.OPTN005;
        COADM1AI.optn005l = this.OPTN005.length;
        COADM1AI.optn006i = this.OPTN006;
        COADM1AI.optn006l = this.OPTN006.length;
        COADM1AI.optn007i = this.OPTN007;
        COADM1AI.optn007l = this.OPTN007.length;
        COADM1AI.optn008i = this.OPTN008;
        COADM1AI.optn008l = this.OPTN008.length;
        COADM1AI.optn009i = this.OPTN009;
        COADM1AI.optn009l = this.OPTN009.length;
        COADM1AI.optn010i = this.OPTN010;
        COADM1AI.optn010l = this.OPTN010.length;
        COADM1AI.optn011i = this.OPTN011;
        COADM1AI.optn011l = this.OPTN011.length;
        COADM1AI.optn012i = this.OPTN012;
        COADM1AI.optn012l = this.OPTN012.length;
        COADM1AI.pgmnamei = this.PGMNAME;
        COADM1AI.pgmnamel = this.PGMNAME.length;
        COADM1AI.title01i = this.TITLE01;
        COADM1AI.title01l = this.TITLE01.length;
        COADM1AI.title02i = this.TITLE02;
        COADM1AI.title02l = this.TITLE02.length;
        COADM1AI.trnnamei = this.TRNNAME;
        COADM1AI.trnnamel = this.TRNNAME.length;
        COADM1AI.optioni = this.OPTION;
        COADM1AI.optionl = this.OPTION.length;

        let request = makeJson("userId", convertPressedKey(keyCode));
        request.COADM1AI = COADM1AI;
        request.systemDto.nextTransaction = systemDto.nextTransaction;
        request.systemDto.serviceId = systemDto.nextTransaction;
        RestPost(history, request, serverUrl, "COADM01_COADM1A");
    },

    simpleRequest(systemDto, keyCode, serverUrl, history) {
        let request = makeJson("userId", convertPressedKey(keyCode));
        request.systemDto.nextTransaction = systemDto.nextTransaction;
        request.systemDto.serviceId = systemDto.nextTransaction;

        console.log("simple request [next tx:]" + request.systemDto.nextTransaction);
        RestPost(history, request, serverUrl, "COADM01_COADM1A");
    }
});

export default COADM01_COADM1AStore;
