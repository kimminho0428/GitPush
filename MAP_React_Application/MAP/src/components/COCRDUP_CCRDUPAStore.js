import React from 'react';
import {observable} from "mobx";
import { CCRDUPAI } from "../data/COCRDUP_CCRDUPAInputDto";
import RestPost from "../runtime/component/io/RestPost";
import {makeJson} from "../runtime/JsonFactory";
import COCRDUP_CCRDUPAValidation from "./COCRDUP_CCRDUPAValidation";
import {changeColorFlag, changeHighlight, convertPressedKey} from "../runtime/KeyEvent";

const COCRDUP_CCRDUPAStore = observable({
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
      EXPDAY: "",
      INFOMSG: "",
      ERRMSG: "",
      FKEYS: "",
      FKEYSC: "",

      setACCTSID(ACCTSID) {
        this.ACCTSID = ACCTSID
      },
      setCARDSID(CARDSID) {
        this.CARDSID = CARDSID
      },
      setCRDNAME(CRDNAME) {
        this.CRDNAME = CRDNAME
      },
      setCRDSTCD(CRDSTCD) {
        this.CRDSTCD = CRDSTCD
      },
      setEXPMON(EXPMON) {
        this.EXPMON = EXPMON
      },
      setEXPYEAR(EXPYEAR) {
        this.EXPYEAR = EXPYEAR
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
          this.EXPDAY = "";
          this.INFOMSG = "";
          this.ERRMSG = "";
          this.FKEYS = "";
          this.FKEYSC = "";
      }
        this.CRDSTCD = parsedData.crdstcdo.trim() === '' ? '' : parsedData.crdstcdo;
        this.EXPDAY = parsedData.expdayo.trim() === '' ? '' : parsedData.expdayo;
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
        this.FKEYSC = parsedData.fkeysco.trim() === '' ? '' : parsedData.fkeysco;
        this.CURDATE = parsedData.curdateo.trim() === '' ? '' : parsedData.curdateo;
    },

    renderStyle(parsedData, TRNNAMERef , TITLE01Ref , CURDATERef , PGMNAMERef , TITLE02Ref , CURTIMERef , ACCTSIDRef , CARDSIDRef , CRDNAMERef , CRDSTCDRef , EXPMONRef , EXPYEARRef , EXPDAYRef , INFOMSGRef , ERRMSGRef , FKEYSRef , FKEYSCRef ) {
      if(parsedData !== null) {
          CRDSTCDRef.current.style.color = changeColorFlag(parsedData.crdstcdc);
          EXPDAYRef.current.style.color = changeColorFlag(parsedData.expdayc);
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
          FKEYSCRef.current.style.color = changeColorFlag(parsedData.fkeyscc);
          CURDATERef.current.style.color = changeColorFlag(parsedData.curdatec);

          changeHighlight(CRDSTCDRef, parsedData.crdstcdh);
          changeHighlight(EXPDAYRef, parsedData.expdayh);
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
          changeHighlight(FKEYSCRef, parsedData.fkeysch);
          changeHighlight(CURDATERef, parsedData.curdateh);
      }
    },

    request(systemDto, keyCode, serverUrl, history, ACCTSIDRef, CARDSIDRef, CRDNAMERef, CRDSTCDRef, EXPMONRef, EXPYEARRef) {
        if(COCRDUP_CCRDUPAValidation({  ACCTSID : this.ACCTSID, ACCTSIDRef : ACCTSIDRef, CARDSID : this.CARDSID, CARDSIDRef : CARDSIDRef, CRDNAME : this.CRDNAME, CRDNAMERef : CRDNAMERef, CRDSTCD : this.CRDSTCD, CRDSTCDRef : CRDSTCDRef, EXPMON : this.EXPMON, EXPMONRef : EXPMONRef, EXPYEAR : this.EXPYEAR, EXPYEARRef : EXPYEARRef, }) === false) {
            return;
        }

        CCRDUPAI.errmsgi = this.ERRMSG;
        CCRDUPAI.errmsgl = this.ERRMSG.length;
        CCRDUPAI.expdayi = this.EXPDAY;
        CCRDUPAI.expdayl = this.EXPDAY.length;
        CCRDUPAI.trnnamei = this.TRNNAME;
        CCRDUPAI.trnnamel = this.TRNNAME.length;
        CCRDUPAI.acctsidi = this.ACCTSID;
        CCRDUPAI.acctsidl = this.ACCTSID.length;
        CCRDUPAI.cardsidi = this.CARDSID;
        CCRDUPAI.cardsidl = this.CARDSID.length;
        CCRDUPAI.crdnamei = this.CRDNAME;
        CCRDUPAI.crdnamel = this.CRDNAME.length;
        CCRDUPAI.crdstcdi = this.CRDSTCD;
        CCRDUPAI.crdstcdl = this.CRDSTCD.length;
        CCRDUPAI.expmoni = this.EXPMON;
        CCRDUPAI.expmonl = this.EXPMON.length;
        CCRDUPAI.expyeari = this.EXPYEAR;
        CCRDUPAI.expyearl = this.EXPYEAR.length;

        let request = makeJson("userId", convertPressedKey(keyCode));
        request.CCRDUPAI = CCRDUPAI;
        request.systemDto.nextTransaction = systemDto.nextTransaction;
        request.systemDto.serviceId = systemDto.nextTransaction;
        RestPost(history, request, serverUrl, "COCRDUP_CCRDUPA");
    },

    simpleRequest(systemDto, keyCode, serverUrl, history) {
        let request = makeJson("userId", convertPressedKey(keyCode));
        request.systemDto.nextTransaction = systemDto.nextTransaction;
        request.systemDto.serviceId = systemDto.nextTransaction;

        console.log("simple request [next tx:]" + request.systemDto.nextTransaction);
        RestPost(history, request, serverUrl, "COCRDUP_CCRDUPA");
    }
});

export default COCRDUP_CCRDUPAStore;

