import React from 'react';
import {observable} from "mobx";
import { CCRDLIAI } from "../data/COCRDLI_CCRDLIAInputDto";
import RestPost from "../runtime/component/io/RestPost";
import {makeJson} from "../runtime/JsonFactory";
import COCRDLI_CCRDLIAValidation from "./COCRDLI_CCRDLIAValidation";
import {changeColorFlag, changeHighlight, convertPressedKey} from "../runtime/KeyEvent";

const COCRDLI_CCRDLIAStore = observable({
      TRNNAME: "",
      TITLE01: "",
      CURDATE: "",
      PGMNAME: "",
      TITLE02: "",
      CURTIME: "",
      PAGENO: "",
      ACCTSID: "",
      CARDSID: "",
      CRDSEL1: "",
      ACCTNO1: "",
      CRDNUM1: "",
      CRDSTS1: "",
      CRDSEL2: "",
      CRDSTP2: "",
      ACCTNO2: "",
      CRDNUM2: "",
      CRDSTS2: "",
      CRDSEL3: "",
      CRDSTP3: "",
      ACCTNO3: "",
      CRDNUM3: "",
      CRDSTS3: "",
      CRDSEL4: "",
      CRDSTP4: "",
      ACCTNO4: "",
      CRDNUM4: "",
      CRDSTS4: "",
      CRDSEL5: "",
      CRDSTP5: "",
      ACCTNO5: "",
      CRDNUM5: "",
      CRDSTS5: "",
      CRDSEL6: "",
      CRDSTP6: "",
      ACCTNO6: "",
      CRDNUM6: "",
      CRDSTS6: "",
      CRDSEL7: "",
      CRDSTP7: "",
      ACCTNO7: "",
      CRDNUM7: "",
      CRDSTS7: "",
      INFOMSG: "",
      ERRMSG: "",

      setACCTSID(ACCTSID) {
        this.ACCTSID = ACCTSID
      },
      setCARDSID(CARDSID) {
        this.CARDSID = CARDSID
      },
      setCRDSEL1(CRDSEL1) {
        this.CRDSEL1 = CRDSEL1
      },
      setCRDSEL2(CRDSEL2) {
        this.CRDSEL2 = CRDSEL2
      },
      setCRDSEL3(CRDSEL3) {
        this.CRDSEL3 = CRDSEL3
      },
      setCRDSEL4(CRDSEL4) {
        this.CRDSEL4 = CRDSEL4
      },
      setCRDSEL5(CRDSEL5) {
        this.CRDSEL5 = CRDSEL5
      },
      setCRDSEL6(CRDSEL6) {
        this.CRDSEL6 = CRDSEL6
      },
      setCRDSEL7(CRDSEL7) {
        this.CRDSEL7 = CRDSEL7
      },

    render(parsedData) {
      if (parsedData == null) {
          this.TRNNAME = "";
          this.TITLE01 = "";
          this.CURDATE = "";
          this.PGMNAME = "";
          this.TITLE02 = "";
          this.CURTIME = "";
          this.PAGENO = "";
          this.ACCTSID = "";
          this.CARDSID = "";
          this.CRDSEL1 = "";
          this.ACCTNO1 = "";
          this.CRDNUM1 = "";
          this.CRDSTS1 = "";
          this.CRDSEL2 = "";
          this.CRDSTP2 = "";
          this.ACCTNO2 = "";
          this.CRDNUM2 = "";
          this.CRDSTS2 = "";
          this.CRDSEL3 = "";
          this.CRDSTP3 = "";
          this.ACCTNO3 = "";
          this.CRDNUM3 = "";
          this.CRDSTS3 = "";
          this.CRDSEL4 = "";
          this.CRDSTP4 = "";
          this.ACCTNO4 = "";
          this.CRDNUM4 = "";
          this.CRDSTS4 = "";
          this.CRDSEL5 = "";
          this.CRDSTP5 = "";
          this.ACCTNO5 = "";
          this.CRDNUM5 = "";
          this.CRDSTS5 = "";
          this.CRDSEL6 = "";
          this.CRDSTP6 = "";
          this.ACCTNO6 = "";
          this.CRDNUM6 = "";
          this.CRDSTS6 = "";
          this.CRDSEL7 = "";
          this.CRDSTP7 = "";
          this.ACCTNO7 = "";
          this.CRDNUM7 = "";
          this.CRDSTS7 = "";
          this.INFOMSG = "";
          this.ERRMSG = "";
      }
        this.CRDSTS1 = parsedData.crdsts1o.trim() === '' ? '' : parsedData.crdsts1o;
        this.ACCTNO5 = parsedData.acctno5o.trim() === '' ? '' : parsedData.acctno5o;
        this.CRDSTS2 = parsedData.crdsts2o.trim() === '' ? '' : parsedData.crdsts2o;
        this.ACCTNO4 = parsedData.acctno4o.trim() === '' ? '' : parsedData.acctno4o;
        this.CRDSTS3 = parsedData.crdsts3o.trim() === '' ? '' : parsedData.crdsts3o;
        this.ACCTNO7 = parsedData.acctno7o.trim() === '' ? '' : parsedData.acctno7o;
        this.CRDSTS4 = parsedData.crdsts4o.trim() === '' ? '' : parsedData.crdsts4o;
        this.ACCTNO6 = parsedData.acctno6o.trim() === '' ? '' : parsedData.acctno6o;
        this.CRDSTS5 = parsedData.crdsts5o.trim() === '' ? '' : parsedData.crdsts5o;
        this.CRDSTS6 = parsedData.crdsts6o.trim() === '' ? '' : parsedData.crdsts6o;
        this.CARDSID = parsedData.cardsido.trim() === '' ? '' : parsedData.cardsido;
        this.CRDSTS7 = parsedData.crdsts7o.trim() === '' ? '' : parsedData.crdsts7o;
        this.CRDNUM2 = parsedData.crdnum2o.trim() === '' ? '' : parsedData.crdnum2o;
        this.CRDNUM1 = parsedData.crdnum1o.trim() === '' ? '' : parsedData.crdnum1o;
        this.CRDNUM4 = parsedData.crdnum4o.trim() === '' ? '' : parsedData.crdnum4o;
        this.CRDNUM3 = parsedData.crdnum3o.trim() === '' ? '' : parsedData.crdnum3o;
        this.CRDNUM6 = parsedData.crdnum6o.trim() === '' ? '' : parsedData.crdnum6o;
        this.ERRMSG = parsedData.errmsgo.trim() === '' ? '' : parsedData.errmsgo;
        this.CURTIME = parsedData.curtimeo.trim() === '' ? '' : parsedData.curtimeo;
        this.CRDNUM5 = parsedData.crdnum5o.trim() === '' ? '' : parsedData.crdnum5o;
        this.CRDNUM7 = parsedData.crdnum7o.trim() === '' ? '' : parsedData.crdnum7o;
        this.TITLE01 = parsedData.title01o.trim() === '' ? '' : parsedData.title01o;
        this.TITLE02 = parsedData.title02o.trim() === '' ? '' : parsedData.title02o;
        this.ACCTSID = parsedData.acctsido.trim() === '' ? '' : parsedData.acctsido;
        this.CRDSEL7 = parsedData.crdsel7o.trim() === '' ? '' : parsedData.crdsel7o;
        this.CRDSEL6 = parsedData.crdsel6o.trim() === '' ? '' : parsedData.crdsel6o;
        this.CRDSEL5 = parsedData.crdsel5o.trim() === '' ? '' : parsedData.crdsel5o;
        this.PAGENO = parsedData.pagenoo.trim() === '' ? '' : parsedData.pagenoo;
        this.CRDSTP6 = parsedData.crdstp6o.trim() === '' ? '' : parsedData.crdstp6o;
        this.CRDSTP7 = parsedData.crdstp7o.trim() === '' ? '' : parsedData.crdstp7o;
        this.CRDSTP2 = parsedData.crdstp2o.trim() === '' ? '' : parsedData.crdstp2o;
        this.CRDSTP3 = parsedData.crdstp3o.trim() === '' ? '' : parsedData.crdstp3o;
        this.CRDSTP4 = parsedData.crdstp4o.trim() === '' ? '' : parsedData.crdstp4o;
        this.CRDSTP5 = parsedData.crdstp5o.trim() === '' ? '' : parsedData.crdstp5o;
        this.TRNNAME = parsedData.trnnameo.trim() === '' ? '' : parsedData.trnnameo;
        this.INFOMSG = parsedData.infomsgo.trim() === '' ? '' : parsedData.infomsgo;
        this.ACCTNO1 = parsedData.acctno1o.trim() === '' ? '' : parsedData.acctno1o;
        this.CRDSEL4 = parsedData.crdsel4o.trim() === '' ? '' : parsedData.crdsel4o;
        this.PGMNAME = parsedData.pgmnameo.trim() === '' ? '' : parsedData.pgmnameo;
        this.CRDSEL3 = parsedData.crdsel3o.trim() === '' ? '' : parsedData.crdsel3o;
        this.CURDATE = parsedData.curdateo.trim() === '' ? '' : parsedData.curdateo;
        this.CRDSEL2 = parsedData.crdsel2o.trim() === '' ? '' : parsedData.crdsel2o;
        this.ACCTNO3 = parsedData.acctno3o.trim() === '' ? '' : parsedData.acctno3o;
        this.CRDSEL1 = parsedData.crdsel1o.trim() === '' ? '' : parsedData.crdsel1o;
        this.ACCTNO2 = parsedData.acctno2o.trim() === '' ? '' : parsedData.acctno2o;
    },

    renderStyle(parsedData, TRNNAMERef , TITLE01Ref , CURDATERef , PGMNAMERef , TITLE02Ref , CURTIMERef , PAGENORef , ACCTSIDRef , CARDSIDRef , CRDSEL1Ref , ACCTNO1Ref , CRDNUM1Ref , CRDSTS1Ref , CRDSEL2Ref , CRDSTP2Ref , ACCTNO2Ref , CRDNUM2Ref , CRDSTS2Ref , CRDSEL3Ref , CRDSTP3Ref , ACCTNO3Ref , CRDNUM3Ref , CRDSTS3Ref , CRDSEL4Ref , CRDSTP4Ref , ACCTNO4Ref , CRDNUM4Ref , CRDSTS4Ref , CRDSEL5Ref , CRDSTP5Ref , ACCTNO5Ref , CRDNUM5Ref , CRDSTS5Ref , CRDSEL6Ref , CRDSTP6Ref , ACCTNO6Ref , CRDNUM6Ref , CRDSTS6Ref , CRDSEL7Ref , CRDSTP7Ref , ACCTNO7Ref , CRDNUM7Ref , CRDSTS7Ref , INFOMSGRef , ERRMSGRef ) {
      if(parsedData !== null) {
          CRDSTS1Ref.current.style.color = changeColorFlag(parsedData.crdsts1c);
          ACCTNO5Ref.current.style.color = changeColorFlag(parsedData.acctno5c);
          CRDSTS2Ref.current.style.color = changeColorFlag(parsedData.crdsts2c);
          ACCTNO4Ref.current.style.color = changeColorFlag(parsedData.acctno4c);
          CRDSTS3Ref.current.style.color = changeColorFlag(parsedData.crdsts3c);
          ACCTNO7Ref.current.style.color = changeColorFlag(parsedData.acctno7c);
          CRDSTS4Ref.current.style.color = changeColorFlag(parsedData.crdsts4c);
          ACCTNO6Ref.current.style.color = changeColorFlag(parsedData.acctno6c);
          CRDSTS5Ref.current.style.color = changeColorFlag(parsedData.crdsts5c);
          CRDSTS6Ref.current.style.color = changeColorFlag(parsedData.crdsts6c);
          CARDSIDRef.current.style.color = changeColorFlag(parsedData.cardsidc);
          CRDSTS7Ref.current.style.color = changeColorFlag(parsedData.crdsts7c);
          CRDNUM2Ref.current.style.color = changeColorFlag(parsedData.crdnum2c);
          CRDNUM1Ref.current.style.color = changeColorFlag(parsedData.crdnum1c);
          CRDNUM4Ref.current.style.color = changeColorFlag(parsedData.crdnum4c);
          CRDNUM3Ref.current.style.color = changeColorFlag(parsedData.crdnum3c);
          CRDNUM6Ref.current.style.color = changeColorFlag(parsedData.crdnum6c);
          ERRMSGRef.current.style.color = changeColorFlag(parsedData.errmsgc);
          CURTIMERef.current.style.color = changeColorFlag(parsedData.curtimec);
          CRDNUM5Ref.current.style.color = changeColorFlag(parsedData.crdnum5c);
          CRDNUM7Ref.current.style.color = changeColorFlag(parsedData.crdnum7c);
          TITLE01Ref.current.style.color = changeColorFlag(parsedData.title01c);
          TITLE02Ref.current.style.color = changeColorFlag(parsedData.title02c);
          ACCTSIDRef.current.style.color = changeColorFlag(parsedData.acctsidc);
          CRDSEL7Ref.current.style.color = changeColorFlag(parsedData.crdsel7c);
          CRDSEL6Ref.current.style.color = changeColorFlag(parsedData.crdsel6c);
          CRDSEL5Ref.current.style.color = changeColorFlag(parsedData.crdsel5c);
          PAGENORef.current.style.color = changeColorFlag(parsedData.pagenoc);
          CRDSTP6Ref.current.style.color = changeColorFlag(parsedData.crdstp6c);
          CRDSTP7Ref.current.style.color = changeColorFlag(parsedData.crdstp7c);
          CRDSTP2Ref.current.style.color = changeColorFlag(parsedData.crdstp2c);
          CRDSTP3Ref.current.style.color = changeColorFlag(parsedData.crdstp3c);
          CRDSTP4Ref.current.style.color = changeColorFlag(parsedData.crdstp4c);
          CRDSTP5Ref.current.style.color = changeColorFlag(parsedData.crdstp5c);
          TRNNAMERef.current.style.color = changeColorFlag(parsedData.trnnamec);
          INFOMSGRef.current.style.color = changeColorFlag(parsedData.infomsgc);
          ACCTNO1Ref.current.style.color = changeColorFlag(parsedData.acctno1c);
          CRDSEL4Ref.current.style.color = changeColorFlag(parsedData.crdsel4c);
          PGMNAMERef.current.style.color = changeColorFlag(parsedData.pgmnamec);
          CRDSEL3Ref.current.style.color = changeColorFlag(parsedData.crdsel3c);
          CURDATERef.current.style.color = changeColorFlag(parsedData.curdatec);
          CRDSEL2Ref.current.style.color = changeColorFlag(parsedData.crdsel2c);
          ACCTNO3Ref.current.style.color = changeColorFlag(parsedData.acctno3c);
          CRDSEL1Ref.current.style.color = changeColorFlag(parsedData.crdsel1c);
          ACCTNO2Ref.current.style.color = changeColorFlag(parsedData.acctno2c);

          changeHighlight(CRDSTS1Ref, parsedData.crdsts1h);
          changeHighlight(ACCTNO5Ref, parsedData.acctno5h);
          changeHighlight(CRDSTS2Ref, parsedData.crdsts2h);
          changeHighlight(ACCTNO4Ref, parsedData.acctno4h);
          changeHighlight(CRDSTS3Ref, parsedData.crdsts3h);
          changeHighlight(ACCTNO7Ref, parsedData.acctno7h);
          changeHighlight(CRDSTS4Ref, parsedData.crdsts4h);
          changeHighlight(ACCTNO6Ref, parsedData.acctno6h);
          changeHighlight(CRDSTS5Ref, parsedData.crdsts5h);
          changeHighlight(CRDSTS6Ref, parsedData.crdsts6h);
          changeHighlight(CARDSIDRef, parsedData.cardsidh);
          changeHighlight(CRDSTS7Ref, parsedData.crdsts7h);
          changeHighlight(CRDNUM2Ref, parsedData.crdnum2h);
          changeHighlight(CRDNUM1Ref, parsedData.crdnum1h);
          changeHighlight(CRDNUM4Ref, parsedData.crdnum4h);
          changeHighlight(CRDNUM3Ref, parsedData.crdnum3h);
          changeHighlight(CRDNUM6Ref, parsedData.crdnum6h);
          changeHighlight(ERRMSGRef, parsedData.errmsgh);
          changeHighlight(CURTIMERef, parsedData.curtimeh);
          changeHighlight(CRDNUM5Ref, parsedData.crdnum5h);
          changeHighlight(CRDNUM7Ref, parsedData.crdnum7h);
          changeHighlight(TITLE01Ref, parsedData.title01h);
          changeHighlight(TITLE02Ref, parsedData.title02h);
          changeHighlight(ACCTSIDRef, parsedData.acctsidh);
          changeHighlight(CRDSEL7Ref, parsedData.crdsel7h);
          changeHighlight(CRDSEL6Ref, parsedData.crdsel6h);
          changeHighlight(CRDSEL5Ref, parsedData.crdsel5h);
          changeHighlight(PAGENORef, parsedData.pagenoh);
          changeHighlight(CRDSTP6Ref, parsedData.crdstp6h);
          changeHighlight(CRDSTP7Ref, parsedData.crdstp7h);
          changeHighlight(CRDSTP2Ref, parsedData.crdstp2h);
          changeHighlight(CRDSTP3Ref, parsedData.crdstp3h);
          changeHighlight(CRDSTP4Ref, parsedData.crdstp4h);
          changeHighlight(CRDSTP5Ref, parsedData.crdstp5h);
          changeHighlight(TRNNAMERef, parsedData.trnnameh);
          changeHighlight(INFOMSGRef, parsedData.infomsgh);
          changeHighlight(ACCTNO1Ref, parsedData.acctno1h);
          changeHighlight(CRDSEL4Ref, parsedData.crdsel4h);
          changeHighlight(PGMNAMERef, parsedData.pgmnameh);
          changeHighlight(CRDSEL3Ref, parsedData.crdsel3h);
          changeHighlight(CURDATERef, parsedData.curdateh);
          changeHighlight(CRDSEL2Ref, parsedData.crdsel2h);
          changeHighlight(ACCTNO3Ref, parsedData.acctno3h);
          changeHighlight(CRDSEL1Ref, parsedData.crdsel1h);
          changeHighlight(ACCTNO2Ref, parsedData.acctno2h);
      }
    },

    request(systemDto, keyCode, serverUrl, history, ACCTSIDRef, CARDSIDRef, CRDSEL1Ref, CRDSEL2Ref, CRDSEL3Ref, CRDSEL4Ref, CRDSEL5Ref, CRDSEL6Ref, CRDSEL7Ref) {
        if(COCRDLI_CCRDLIAValidation({  ACCTSID : this.ACCTSID, ACCTSIDRef : ACCTSIDRef, CARDSID : this.CARDSID, CARDSIDRef : CARDSIDRef, CRDSEL1 : this.CRDSEL1, CRDSEL1Ref : CRDSEL1Ref, CRDSEL2 : this.CRDSEL2, CRDSEL2Ref : CRDSEL2Ref, CRDSEL3 : this.CRDSEL3, CRDSEL3Ref : CRDSEL3Ref, CRDSEL4 : this.CRDSEL4, CRDSEL4Ref : CRDSEL4Ref, CRDSEL5 : this.CRDSEL5, CRDSEL5Ref : CRDSEL5Ref, CRDSEL6 : this.CRDSEL6, CRDSEL6Ref : CRDSEL6Ref, CRDSEL7 : this.CRDSEL7, CRDSEL7Ref : CRDSEL7Ref, }) === false) {
            return;
        }

        CCRDLIAI.crdstp2i = this.CRDSTP2;
        CCRDLIAI.crdstp2l = this.CRDSTP2.length;
        CCRDLIAI.crdstp3i = this.CRDSTP3;
        CCRDLIAI.crdstp3l = this.CRDSTP3.length;
        CCRDLIAI.crdstp4i = this.CRDSTP4;
        CCRDLIAI.crdstp4l = this.CRDSTP4.length;
        CCRDLIAI.crdstp5i = this.CRDSTP5;
        CCRDLIAI.crdstp5l = this.CRDSTP5.length;
        CCRDLIAI.crdstp6i = this.CRDSTP6;
        CCRDLIAI.crdstp6l = this.CRDSTP6.length;
        CCRDLIAI.crdstp7i = this.CRDSTP7;
        CCRDLIAI.crdstp7l = this.CRDSTP7.length;
        CCRDLIAI.errmsgi = this.ERRMSG;
        CCRDLIAI.errmsgl = this.ERRMSG.length;
        CCRDLIAI.trnnamei = this.TRNNAME;
        CCRDLIAI.trnnamel = this.TRNNAME.length;
        CCRDLIAI.acctsidi = this.ACCTSID;
        CCRDLIAI.acctsidl = this.ACCTSID.length;
        CCRDLIAI.cardsidi = this.CARDSID;
        CCRDLIAI.cardsidl = this.CARDSID.length;
        CCRDLIAI.crdsel1i = this.CRDSEL1;
        CCRDLIAI.crdsel1l = this.CRDSEL1.length;
        CCRDLIAI.crdsel2i = this.CRDSEL2;
        CCRDLIAI.crdsel2l = this.CRDSEL2.length;
        CCRDLIAI.crdsel3i = this.CRDSEL3;
        CCRDLIAI.crdsel3l = this.CRDSEL3.length;
        CCRDLIAI.crdsel4i = this.CRDSEL4;
        CCRDLIAI.crdsel4l = this.CRDSEL4.length;
        CCRDLIAI.crdsel5i = this.CRDSEL5;
        CCRDLIAI.crdsel5l = this.CRDSEL5.length;
        CCRDLIAI.crdsel6i = this.CRDSEL6;
        CCRDLIAI.crdsel6l = this.CRDSEL6.length;
        CCRDLIAI.crdsel7i = this.CRDSEL7;
        CCRDLIAI.crdsel7l = this.CRDSEL7.length;

        let request = makeJson("userId", convertPressedKey(keyCode));
        request.CCRDLIAI = CCRDLIAI;
        request.systemDto.nextTransaction = systemDto.nextTransaction;
        request.systemDto.serviceId = systemDto.nextTransaction;
        RestPost(history, request, serverUrl, "COCRDLI_CCRDLIA");
    },

    simpleRequest(systemDto, keyCode, serverUrl, history) {
        let request = makeJson("userId", convertPressedKey(keyCode));
        request.systemDto.nextTransaction = systemDto.nextTransaction;
        request.systemDto.serviceId = systemDto.nextTransaction;

        console.log("simple request [next tx:]" + request.systemDto.nextTransaction);
        RestPost(history, request, serverUrl, "COCRDLI_CCRDLIA");
    }
});

export default COCRDLI_CCRDLIAStore;

