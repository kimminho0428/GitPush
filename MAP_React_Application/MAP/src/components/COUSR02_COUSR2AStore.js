import React from 'react';
import {observable} from "mobx";
import { COUSR2AI } from "../data/COUSR02_COUSR2AInputDto";
import RestPost from "../runtime/component/io/RestPost";
import {makeJson} from "../runtime/JsonFactory";
import COUSR02_COUSR2AValidation from "./COUSR02_COUSR2AValidation";
import {changeColorFlag, changeHighlight, convertPressedKey} from "../runtime/KeyEvent";

const COUSR02_COUSR2AStore = observable({
      TRNNAME: "",
      TITLE01: "",
      CURDATE: "",
      PGMNAME: "",
      TITLE02: "",
      CURTIME: "",
      USRIDIN: "",
      FNAME: "",
      LNAME: "",
      PASSWD: "",
      USRTYPE: "",
      ERRMSG: "",

      setFNAME(FNAME) {
        this.FNAME = FNAME
      },
      setLNAME(LNAME) {
        this.LNAME = LNAME
      },
      setPASSWD(PASSWD) {
        this.PASSWD = PASSWD
      },
      setUSRIDIN(USRIDIN) {
        this.USRIDIN = USRIDIN
      },
      setUSRTYPE(USRTYPE) {
        this.USRTYPE = USRTYPE
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
          this.PASSWD = "";
          this.USRTYPE = "";
          this.ERRMSG = "";
      }
        this.PASSWD = parsedData.passwdo.trim() === '' ? '' : parsedData.passwdo;
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

    renderStyle(parsedData, TRNNAMERef , TITLE01Ref , CURDATERef , PGMNAMERef , TITLE02Ref , CURTIMERef , USRIDINRef , FNAMERef , LNAMERef , PASSWDRef , USRTYPERef , ERRMSGRef ) {
      if(parsedData !== null) {
          PASSWDRef.current.style.color = changeColorFlag(parsedData.passwdc);
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

          changeHighlight(PASSWDRef, parsedData.passwdh);
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

    request(systemDto, keyCode, serverUrl, history, FNAMERef, LNAMERef, PASSWDRef, USRIDINRef, USRTYPERef) {
        if(COUSR02_COUSR2AValidation({  FNAME : this.FNAME, FNAMERef : FNAMERef, LNAME : this.LNAME, LNAMERef : LNAMERef, PASSWD : this.PASSWD, PASSWDRef : PASSWDRef, USRIDIN : this.USRIDIN, USRIDINRef : USRIDINRef, USRTYPE : this.USRTYPE, USRTYPERef : USRTYPERef, }) === false) {
            return;
        }

        COUSR2AI.curdatei = this.CURDATE;
        COUSR2AI.curdatel = this.CURDATE.length;
        COUSR2AI.curtimei = this.CURTIME;
        COUSR2AI.curtimel = this.CURTIME.length;
        COUSR2AI.errmsgi = this.ERRMSG;
        COUSR2AI.errmsgl = this.ERRMSG.length;
        COUSR2AI.pgmnamei = this.PGMNAME;
        COUSR2AI.pgmnamel = this.PGMNAME.length;
        COUSR2AI.title01i = this.TITLE01;
        COUSR2AI.title01l = this.TITLE01.length;
        COUSR2AI.title02i = this.TITLE02;
        COUSR2AI.title02l = this.TITLE02.length;
        COUSR2AI.trnnamei = this.TRNNAME;
        COUSR2AI.trnnamel = this.TRNNAME.length;
        COUSR2AI.fnamei = this.FNAME;
        COUSR2AI.fnamel = this.FNAME.length;
        COUSR2AI.lnamei = this.LNAME;
        COUSR2AI.lnamel = this.LNAME.length;
        COUSR2AI.passwdi = this.PASSWD;
        COUSR2AI.passwdl = this.PASSWD.length;
        COUSR2AI.usridini = this.USRIDIN;
        COUSR2AI.usridinl = this.USRIDIN.length;
        COUSR2AI.usrtypei = this.USRTYPE;
        COUSR2AI.usrtypel = this.USRTYPE.length;

        let request = makeJson("userId", convertPressedKey(keyCode));
        request.COUSR2AI = COUSR2AI;
        request.systemDto.nextTransaction = systemDto.nextTransaction;
        request.systemDto.serviceId = systemDto.nextTransaction;
        RestPost(history, request, serverUrl, "COUSR02_COUSR2A");
    },

    simpleRequest(systemDto, keyCode, serverUrl, history) {
        let request = makeJson("userId", convertPressedKey(keyCode));
        request.systemDto.nextTransaction = systemDto.nextTransaction;
        request.systemDto.serviceId = systemDto.nextTransaction;

        console.log("simple request [next tx:]" + request.systemDto.nextTransaction);
        RestPost(history, request, serverUrl, "COUSR02_COUSR2A");
    }
});

export default COUSR02_COUSR2AStore;

