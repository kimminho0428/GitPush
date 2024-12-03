import React, {useState, useEffect, useRef, forwardRef} from 'react';
import '../runtime/Lineare.scss';
import '../ui/COCRDSL_CCRDSLA.scss';
import '../runtime/LayoutTemplate.scss';
import useStore from "../store/UseStore";

const COCRDSL_CCRDSLAView = forwardRef((props) => {
    const { COCRDSL_CCRDSLAStore } = useStore();
    const {location, ACCTSIDRef, onKeyPressedACCTSID, CARDSIDRef, onKeyPressedCARDSID , TRNNAMERef, TITLE01Ref, CURDATERef, PGMNAMERef, TITLE02Ref, CURTIMERef, CRDNAMERef, CRDSTCDRef, EXPMONRef, EXPYEARRef, INFOMSGRef, ERRMSGRef, FKEYSRef } = props;

    return (
        <div className='LayoutTemplate'>
          {/*<Navigator termId={termId}>*/}
          {/*  <Logout startCode={startCode} termId={termId} path={path}/>*/}
          {/*</Navigator>*/}
          <div className='linear'>
            <div className = 'COCRDSL_CCRDSLA'>
                <div className = 'TRNNAME' ref = { TRNNAMERef }>{ COCRDSL_CCRDSLAStore.TRNNAME }</div>
                <div className = 'TITLE01' ref = { TITLE01Ref }>{ COCRDSL_CCRDSLAStore.TITLE01 }</div>
                <div className = 'CURDATE' ref = { CURDATERef }>{ COCRDSL_CCRDSLAStore.CURDATE }</div>
                <div className = 'PGMNAME' ref = { PGMNAMERef }>{ COCRDSL_CCRDSLAStore.PGMNAME }</div>
                <div className = 'TITLE02' ref = { TITLE02Ref }>{ COCRDSL_CCRDSLAStore.TITLE02 }</div>
                <div className = 'CURTIME' ref = { CURTIMERef }>{ COCRDSL_CCRDSLAStore.CURTIME }</div>
                <div className = 'CRDNAME' ref = { CRDNAMERef }>{ COCRDSL_CCRDSLAStore.CRDNAME }</div>
                <div className = 'CRDSTCD' ref = { CRDSTCDRef }>{ COCRDSL_CCRDSLAStore.CRDSTCD }</div>
                <div className = 'EXPMON' ref = { EXPMONRef }>{ COCRDSL_CCRDSLAStore.EXPMON }</div>
                <div className = 'EXPYEAR' ref = { EXPYEARRef }>{ COCRDSL_CCRDSLAStore.EXPYEAR }</div>
                <div className = 'INFOMSG' ref = { INFOMSGRef }>{ COCRDSL_CCRDSLAStore.INFOMSG }</div>
                <div className = 'ERRMSG' ref = { ERRMSGRef }>{ COCRDSL_CCRDSLAStore.ERRMSG }</div>
                <div className = 'FKEYS' ref = { FKEYSRef }>{ COCRDSL_CCRDSLAStore.FKEYS }</div>
                <input className = 'ACCTSID'
                       type = 'text'
                       name = 'ACCTSID'
                       value = { COCRDSL_CCRDSLAStore.ACCTSID  || ''  }
                       onChange = { onKeyPressedACCTSID }
                       ref = { ACCTSIDRef }
                       maxLength = { 11.0 }
                ></input>
                <input className = 'CARDSID'
                       type = 'text'
                       name = 'CARDSID'
                       value = { COCRDSL_CCRDSLAStore.CARDSID  || ''  }
                       onChange = { onKeyPressedCARDSID }
                       ref = { CARDSIDRef }
                       maxLength = { 16.0 }
                ></input>
                <div className = '_field182'>Tran:</div>
                <div className = '_field185'>Date:</div>
                <div className = '_field187'>Prog:</div>
                <div className = '_field190'>Time:</div>
                <div className = '_field192'>View Credit Card Detail</div>
                <div className = '_field193'>Account Number    :</div>
                <div className = '_field195'></div>
                <div className = '_field196'>Card Number       :</div>
                <div className = '_field198'></div>
                <div className = '_field199'>Name on card      :</div>
                <div className = '_field201'></div>
                <div className = '_field202'>Card Active Y/N   : </div>
                <div className = '_field204'></div>
                <div className = '_field205'>Expiry Date       : </div>
                <div className = '_field207'>/</div>
                <div className = '_field209'></div>
            </div>
          </div>
        </div>
    );
});
export default COCRDSL_CCRDSLAView;


