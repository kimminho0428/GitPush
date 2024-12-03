import React from 'react';
import {observable} from "mobx";
import { CCRDSLAI } from "../data/COCRDSL_CCRDSLAInputDto";
import RestPost from "../runtime/component/io/RestPost";
import {makeJson} from "../runtime/JsonFactory";
import COCRDSL_CCRDSLAValidation from "./COCRDSL_CCRDSLAValidation";
import {changeColorFlag, changeHighlight, convertPressedKey} from "../runtime/KeyEvent";

const COCRDSL_CCRDSLAStore = observable({
      TRNNAME: "",
      TITLE01: "",
      CURDATE: "",
      PGMNAME: "",
      TITLE02: "",
      CURTIME: "",
      ACCTSID: "",
      CARDSID: "",
      CRDNAME: "",
      CRDSTCD: "",
      EXPMON: "",
      EXPYEAR: "",
      INFOMSG: "",
      ERRMSG: "",
      FKEYS: "",

      setACCTSID(ACCTSID) {
        this.ACCTSID = ACCTSID
      },
      setCARDSID(CARDSID) {
        this.CARDSID = CARDSID
      },

    render(parsedData) {
      if (parsedData == null) {
          this.TRNNAME = "";
          this.TITLE01 = "";
          this.CURDATE = "";
          this.PGMNAME = "";
          this.TITLE02 = "";
          this.CURTIME = "";
          this.ACCTSID = "";
          this.CARDSID = "";
          this.CRDNAME = "";
          this.CRDSTCD = "";
          this.EXPMON = "";
          this.EXPYEAR = "";
          this.INFOMSG = "";
          this.ERRMSG = "";
          this.FKEYS = "";
      }
        this.CRDSTCD = parsedData.crdstcdo.trim() === '' ? '' : parsedData.crdstcdo;
        this.FKEYS = parsedData.fkeyso.trim() === '' ? '' : parsedData.fkeyso;
        this.CARDSID = parsedData.cardsido.trim() === '' ? '' : parsedData.cardsido;
        this.CRDNAME = parsedData.crdnameo.trim() === '' ? '' : parsedData.crdnameo;
        this.TRNNAME = parsedData.trnnameo.trim() === '' ? '' : parsedData.trnnameo;
        this.EXPYEAR = parsedData.expyearo.trim() === '' ? '' : parsedData.expyearo;
        this.INFOMSG = parsedData.infomsgo.trim() === '' ? '' : parsedData.infomsgo;
        this.EXPMON = parsedData.expmono.trim() === '' ? '' : parsedData.expmono;
        this.ERRMSG = parsedData.errmsgo.trim() === '' ? '' : parsedData.errmsgo;
        this.CURTIME = parsedData.curtimeo.trim() === '' ? '' : parsedData.curtimeo;
        this.TITLE01 = parsedData.title01o.trim() === '' ? '' : parsedData.title01o;
        this.TITLE02 = parsedData.title02o.trim() === '' ? '' : parsedData.title02o;
        this.ACCTSID = parsedData.acctsido.trim() === '' ? '' : parsedData.acctsido;
        this.PGMNAME = parsedData.pgmnameo.trim() === '' ? '' : parsedData.pgmnameo;
        this.CURDATE = parsedData.curdateo.trim() === '' ? '' : parsedData.curdateo;
    },

    renderStyle(parsedData, TRNNAMERef , TITLE01Ref , CURDATERef , PGMNAMERef , TITLE02Ref , CURTIMERef , ACCTSIDRef , CARDSIDRef , CRDNAMERef , CRDSTCDRef , EXPMONRef , EXPYEARRef , INFOMSGRef , ERRMSGRef , FKEYSRef ) {
      if(parsedData !== null) {
          CRDSTCDRef.current.style.color = changeColorFlag(parsedData.crdstcdc);
          FKEYSRef.current.style.color = changeColorFlag(parsedData.fkeysc);
          CARDSIDRef.current.style.color = changeColorFlag(parsedData.cardsidc);
          CRDNAMERef.current.style.color = changeColorFlag(parsedData.crdnamec);
          TRNNAMERef.current.style.color = changeColorFlag(parsedData.trnnamec);
          EXPYEARRef.current.style.color = changeColorFlag(parsedData.expyearc);
          INFOMSGRef.current.style.color = changeColorFlag(parsedData.infomsgc);
          EXPMONRef.current.style.color = changeColorFlag(parsedData.expmonc);
          ERRMSGRef.current.style.color = changeColorFlag(parsedData.errmsgc);
          CURTIMERef.current.style.color = changeColorFlag(parsedData.curtimec);
          TITLE01Ref.current.style.color = changeColorFlag(parsedData.title01c);
          TITLE02Ref.current.style.color = changeColorFlag(parsedData.title02c);
          ACCTSIDRef.current.style.color = changeColorFlag(parsedData.acctsidc);
          PGMNAMERef.current.style.color = changeColorFlag(parsedData.pgmnamec);
          CURDATERef.current.style.color = changeColorFlag(parsedData.curdatec);

          changeHighlight(CRDSTCDRef, parsedData.crdstcdh);
          changeHighlight(FKEYSRef, parsedData.fkeysh);
          changeHighlight(CARDSIDRef, parsedData.cardsidh);
          changeHighlight(CRDNAMERef, parsedData.crdnameh);
          changeHighlight(TRNNAMERef, parsedData.trnnameh);
          changeHighlight(EXPYEARRef, parsedData.expyearh);
          changeHighlight(INFOMSGRef, parsedData.infomsgh);
          changeHighlight(EXPMONRef, parsedData.expmonh);
          changeHighlight(ERRMSGRef, parsedData.errmsgh);
          changeHighlight(CURTIMERef, parsedData.curtimeh);
          changeHighlight(TITLE01Ref, parsedData.title01h);
          changeHighlight(TITLE02Ref, parsedData.title02h);
          changeHighlight(ACCTSIDRef, parsedData.acctsidh);
          changeHighlight(PGMNAMERef, parsedData.pgmnameh);
          changeHighlight(CURDATERef, parsedData.curdateh);
      }
    },

    request(systemDto, keyCode, serverUrl, history, ACCTSIDRef, CARDSIDRef) {
        if(COCRDSL_CCRDSLAValidation({  ACCTSID : this.ACCTSID, ACCTSIDRef : ACCTSIDRef, CARDSID : this.CARDSID, CARDSIDRef : CARDSIDRef, }) === false) {
            return;
        }

        CCRDSLAI.errmsgi = this.ERRMSG;
        CCRDSLAI.errmsgl = this.ERRMSG.length;
        CCRDSLAI.trnnamei = this.TRNNAME;
        CCRDSLAI.trnnamel = this.TRNNAME.length;
        CCRDSLAI.acctsidi = this.ACCTSID;
        CCRDSLAI.acctsidl = this.ACCTSID.length;
        CCRDSLAI.cardsidi = this.CARDSID;
        CCRDSLAI.cardsidl = this.CARDSID.length;

        let request = makeJson("userId", convertPressedKey(keyCode));
        request.CCRDSLAI = CCRDSLAI;
        request.systemDto.nextTransaction = systemDto.nextTransaction;
        request.systemDto.serviceId = systemDto.nextTransaction;
        RestPost(history, request, serverUrl, "COCRDSL_CCRDSLA");
    },

    simpleRequest(systemDto, keyCode, serverUrl, history) {
        let request = makeJson("userId", convertPressedKey(keyCode));
        request.systemDto.nextTransaction = systemDto.nextTransaction;
        request.systemDto.serviceId = systemDto.nextTransaction;

        console.log("simple request [next tx:]" + request.systemDto.nextTransaction);
        RestPost(history, request, serverUrl, "COCRDSL_CCRDSLA");
    }
});

export default COCRDSL_CCRDSLAStore;

