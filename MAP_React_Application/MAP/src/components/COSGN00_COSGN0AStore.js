import React from 'react';
import {observable} from "mobx";
import { COSGN0AI } from "../data/COSGN00_COSGN0AInputDto";
import RestPost from "../runtime/component/io/RestPost";
import {makeJson} from "../runtime/JsonFactory";
import COSGN00_COSGN0AValidation from "./COSGN00_COSGN0AValidation";
import {changeColorFlag, changeHighlight, convertPressedKey} from "../runtime/KeyEvent";

const COSGN00_COSGN0AStore = observable({
      TRNNAME: "",
      TITLE01: "",
      CURDATE: "",
      PGMNAME: "",
      TITLE02: "",
      CURTIME: "",
      APPLID: "",
      SYSID: "",
      USERID: "",
      PASSWD: "",
      ERRMSG: "",

      setPASSWD(PASSWD) {
        this.PASSWD = PASSWD
      },
      setUSERID(USERID) {
        this.USERID = USERID
      },

    render(parsedData) {
      if (parsedData == null) {
          this.TRNNAME = "";
          this.TITLE01 = "";
          this.CURDATE = "";
          this.PGMNAME = "";
          this.TITLE02 = "";
          this.CURTIME = "";
          this.APPLID = "";
          this.SYSID = "";
          this.USERID = "";
          this.PASSWD = "";
          this.ERRMSG = "";
      }
        this.PASSWD = parsedData.passwdo.trim() === '' ? '' : parsedData.passwdo;
        this.APPLID = parsedData.applido.trim() === '' ? '' : parsedData.applido;
        this.TRNNAME = parsedData.trnnameo.trim() === '' ? '' : parsedData.trnnameo;
        this.SYSID = parsedData.sysido.trim() === '' ? '' : parsedData.sysido;
        this.ERRMSG = parsedData.errmsgo.trim() === '' ? '' : parsedData.errmsgo;
        this.CURTIME = parsedData.curtimeo.trim() === '' ? '' : parsedData.curtimeo;
        this.USERID = parsedData.userido.trim() === '' ? '' : parsedData.userido;
        this.TITLE01 = parsedData.title01o.trim() === '' ? '' : parsedData.title01o;
        this.TITLE02 = parsedData.title02o.trim() === '' ? '' : parsedData.title02o;
        this.PGMNAME = parsedData.pgmnameo.trim() === '' ? '' : parsedData.pgmnameo;
        this.CURDATE = parsedData.curdateo.trim() === '' ? '' : parsedData.curdateo;
    },

    renderStyle(parsedData, TRNNAMERef , TITLE01Ref , CURDATERef , PGMNAMERef , TITLE02Ref , CURTIMERef , APPLIDRef , SYSIDRef , USERIDRef , PASSWDRef , ERRMSGRef ) {
      if(parsedData !== null) {
          PASSWDRef.current.style.color = changeColorFlag(parsedData.passwdc);
          APPLIDRef.current.style.color = changeColorFlag(parsedData.applidc);
          TRNNAMERef.current.style.color = changeColorFlag(parsedData.trnnamec);
          SYSIDRef.current.style.color = changeColorFlag(parsedData.sysidc);
          ERRMSGRef.current.style.color = changeColorFlag(parsedData.errmsgc);
          CURTIMERef.current.style.color = changeColorFlag(parsedData.curtimec);
          USERIDRef.current.style.color = changeColorFlag(parsedData.useridc);
          TITLE01Ref.current.style.color = changeColorFlag(parsedData.title01c);
          TITLE02Ref.current.style.color = changeColorFlag(parsedData.title02c);
          PGMNAMERef.current.style.color = changeColorFlag(parsedData.pgmnamec);
          CURDATERef.current.style.color = changeColorFlag(parsedData.curdatec);

          changeHighlight(PASSWDRef, parsedData.passwdh);
          changeHighlight(APPLIDRef, parsedData.applidh);
          changeHighlight(TRNNAMERef, parsedData.trnnameh);
          changeHighlight(SYSIDRef, parsedData.sysidh);
          changeHighlight(ERRMSGRef, parsedData.errmsgh);
          changeHighlight(CURTIMERef, parsedData.curtimeh);
          changeHighlight(USERIDRef, parsedData.useridh);
          changeHighlight(TITLE01Ref, parsedData.title01h);
          changeHighlight(TITLE02Ref, parsedData.title02h);
          changeHighlight(PGMNAMERef, parsedData.pgmnameh);
          changeHighlight(CURDATERef, parsedData.curdateh);
      }
    },

    request(systemDto, keyCode, serverUrl, history, PASSWDRef, USERIDRef) {
        if(COSGN00_COSGN0AValidation({  PASSWD : this.PASSWD, PASSWDRef : PASSWDRef, USERID : this.USERID, USERIDRef : USERIDRef, }) === false) {
            return;
        }

        COSGN0AI.applidi = this.APPLID;
        COSGN0AI.applidl = this.APPLID.length;
        COSGN0AI.curdatei = this.CURDATE;
        COSGN0AI.curdatel = this.CURDATE.length;
        COSGN0AI.curtimei = this.CURTIME;
        COSGN0AI.curtimel = this.CURTIME.length;
        COSGN0AI.errmsgi = this.ERRMSG;
        COSGN0AI.errmsgl = this.ERRMSG.length;
        COSGN0AI.pgmnamei = this.PGMNAME;
        COSGN0AI.pgmnamel = this.PGMNAME.length;
        COSGN0AI.sysidi = this.SYSID;
        COSGN0AI.sysidl = this.SYSID.length;
        COSGN0AI.title01i = this.TITLE01;
        COSGN0AI.title01l = this.TITLE01.length;
        COSGN0AI.title02i = this.TITLE02;
        COSGN0AI.title02l = this.TITLE02.length;
        COSGN0AI.trnnamei = this.TRNNAME;
        COSGN0AI.trnnamel = this.TRNNAME.length;
        COSGN0AI.passwdi = this.PASSWD;
        COSGN0AI.passwdl = this.PASSWD.length;
        COSGN0AI.useridi = this.USERID;
        COSGN0AI.useridl = this.USERID.length;

        let request = makeJson("userId", convertPressedKey(keyCode));
        request.COSGN0AI = COSGN0AI;
        request.systemDto.nextTransaction = systemDto.nextTransaction;
        request.systemDto.serviceId = systemDto.nextTransaction;
        RestPost(history, request, serverUrl, "COSGN00_COSGN0A");
    },

    simpleRequest(systemDto, keyCode, serverUrl, history) {
        let request = makeJson("userId", convertPressedKey(keyCode));
        request.systemDto.nextTransaction = systemDto.nextTransaction;
        request.systemDto.serviceId = systemDto.nextTransaction;

        console.log("simple request [next tx:]" + request.systemDto.nextTransaction);
        RestPost(history, request, serverUrl, "COSGN00_COSGN0A");
    }
});

export default COSGN00_COSGN0AStore;

