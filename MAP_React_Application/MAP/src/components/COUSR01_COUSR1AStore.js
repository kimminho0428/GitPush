import React from 'react';
import {observable} from "mobx";
import { COUSR1AI } from "../data/COUSR01_COUSR1AInputDto";
import RestPost from "../runtime/component/io/RestPost";
import {makeJson} from "../runtime/JsonFactory";
import COUSR01_COUSR1AValidation from "./COUSR01_COUSR1AValidation";
import {changeColorFlag, changeHighlight, convertPressedKey} from "../runtime/KeyEvent";

const COUSR01_COUSR1AStore = observable({
      TRNNAME: "",
      TITLE01: "",
      CURDATE: "",
      PGMNAME: "",
      TITLE02: "",
      CURTIME: "",
      FNAME: "",
      LNAME: "",
      USERID: "",
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
      setUSERID(USERID) {
        this.USERID = USERID
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
          this.FNAME = "";
          this.LNAME = "";
          this.USERID = "";
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
        this.USERID = parsedData.userido.trim() === '' ? '' : parsedData.userido;
        this.TITLE01 = parsedData.title01o.trim() === '' ? '' : parsedData.title01o;
        this.TITLE02 = parsedData.title02o.trim() === '' ? '' : parsedData.title02o;
        this.PGMNAME = parsedData.pgmnameo.trim() === '' ? '' : parsedData.pgmnameo;
        this.CURDATE = parsedData.curdateo.trim() === '' ? '' : parsedData.curdateo;
        this.FNAME = parsedData.fnameo.trim() === '' ? '' : parsedData.fnameo;
    },

    renderStyle(parsedData, TRNNAMERef , TITLE01Ref , CURDATERef , PGMNAMERef , TITLE02Ref , CURTIMERef , FNAMERef , LNAMERef , USERIDRef , PASSWDRef , USRTYPERef , ERRMSGRef ) {
      if(parsedData !== null) {
          PASSWDRef.current.style.color = changeColorFlag(parsedData.passwdc);
          USRTYPERef.current.style.color = changeColorFlag(parsedData.usrtypec);
          TRNNAMERef.current.style.color = changeColorFlag(parsedData.trnnamec);
          LNAMERef.current.style.color = changeColorFlag(parsedData.lnamec);
          ERRMSGRef.current.style.color = changeColorFlag(parsedData.errmsgc);
          CURTIMERef.current.style.color = changeColorFlag(parsedData.curtimec);
          USERIDRef.current.style.color = changeColorFlag(parsedData.useridc);
          TITLE01Ref.current.style.color = changeColorFlag(parsedData.title01c);
          TITLE02Ref.current.style.color = changeColorFlag(parsedData.title02c);
          PGMNAMERef.current.style.color = changeColorFlag(parsedData.pgmnamec);
          CURDATERef.current.style.color = changeColorFlag(parsedData.curdatec);
          FNAMERef.current.style.color = changeColorFlag(parsedData.fnamec);

          changeHighlight(PASSWDRef, parsedData.passwdh);
          changeHighlight(USRTYPERef, parsedData.usrtypeh);
          changeHighlight(TRNNAMERef, parsedData.trnnameh);
          changeHighlight(LNAMERef, parsedData.lnameh);
          changeHighlight(ERRMSGRef, parsedData.errmsgh);
          changeHighlight(CURTIMERef, parsedData.curtimeh);
          changeHighlight(USERIDRef, parsedData.useridh);
          changeHighlight(TITLE01Ref, parsedData.title01h);
          changeHighlight(TITLE02Ref, parsedData.title02h);
          changeHighlight(PGMNAMERef, parsedData.pgmnameh);
          changeHighlight(CURDATERef, parsedData.curdateh);
          changeHighlight(FNAMERef, parsedData.fnameh);
      }
    },

    request(systemDto, keyCode, serverUrl, history, FNAMERef, LNAMERef, PASSWDRef, USERIDRef, USRTYPERef) {
        if(COUSR01_COUSR1AValidation({  FNAME : this.FNAME, FNAMERef : FNAMERef, LNAME : this.LNAME, LNAMERef : LNAMERef, PASSWD : this.PASSWD, PASSWDRef : PASSWDRef, USERID : this.USERID, USERIDRef : USERIDRef, USRTYPE : this.USRTYPE, USRTYPERef : USRTYPERef, }) === false) {
            return;
        }

        COUSR1AI.curdatei = this.CURDATE;
        COUSR1AI.curdatel = this.CURDATE.length;
        COUSR1AI.curtimei = this.CURTIME;
        COUSR1AI.curtimel = this.CURTIME.length;
        COUSR1AI.errmsgi = this.ERRMSG;
        COUSR1AI.errmsgl = this.ERRMSG.length;
        COUSR1AI.pgmnamei = this.PGMNAME;
        COUSR1AI.pgmnamel = this.PGMNAME.length;
        COUSR1AI.title01i = this.TITLE01;
        COUSR1AI.title01l = this.TITLE01.length;
        COUSR1AI.title02i = this.TITLE02;
        COUSR1AI.title02l = this.TITLE02.length;
        COUSR1AI.trnnamei = this.TRNNAME;
        COUSR1AI.trnnamel = this.TRNNAME.length;
        COUSR1AI.fnamei = this.FNAME;
        COUSR1AI.fnamel = this.FNAME.length;
        COUSR1AI.lnamei = this.LNAME;
        COUSR1AI.lnamel = this.LNAME.length;
        COUSR1AI.passwdi = this.PASSWD;
        COUSR1AI.passwdl = this.PASSWD.length;
        COUSR1AI.useridi = this.USERID;
        COUSR1AI.useridl = this.USERID.length;
        COUSR1AI.usrtypei = this.USRTYPE;
        COUSR1AI.usrtypel = this.USRTYPE.length;

        let request = makeJson("userId", convertPressedKey(keyCode));
        request.COUSR1AI = COUSR1AI;
        request.systemDto.nextTransaction = systemDto.nextTransaction;
        request.systemDto.serviceId = systemDto.nextTransaction;
        RestPost(history, request, serverUrl, "COUSR01_COUSR1A");
    },

    simpleRequest(systemDto, keyCode, serverUrl, history) {
        let request = makeJson("userId", convertPressedKey(keyCode));
        request.systemDto.nextTransaction = systemDto.nextTransaction;
        request.systemDto.serviceId = systemDto.nextTransaction;

        console.log("simple request [next tx:]" + request.systemDto.nextTransaction);
        RestPost(history, request, serverUrl, "COUSR01_COUSR1A");
    }
});

export default COUSR01_COUSR1AStore;

