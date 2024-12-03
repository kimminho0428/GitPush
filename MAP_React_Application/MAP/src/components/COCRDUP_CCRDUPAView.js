import React, {useState, useEffect, useRef, forwardRef} from 'react';
import '../runtime/Lineare.scss';
import '../ui/COCRDUP_CCRDUPA.scss';
import '../runtime/LayoutTemplate.scss';
import useStore from "../store/UseStore";

const COCRDUP_CCRDUPAView = forwardRef((props) => {
    const { COCRDUP_CCRDUPAStore } = useStore();
    const {location, ACCTSIDRef, onKeyPressedACCTSID, CARDSIDRef, onKeyPressedCARDSID, CRDNAMERef, onKeyPressedCRDNAME, CRDSTCDRef, onKeyPressedCRDSTCD, EXPMONRef, onKeyPressedEXPMON, EXPYEARRef, onKeyPressedEXPYEAR , TRNNAMERef, TITLE01Ref, CURDATERef, PGMNAMERef, TITLE02Ref, CURTIMERef, EXPDAYRef, INFOMSGRef, ERRMSGRef, FKEYSRef, FKEYSCRef } = props;

    return (
        <div className='LayoutTemplate'>
          {/*<Navigator termId={termId}>*/}
          {/*  <Logout startCode={startCode} termId={termId} path={path}/>*/}
          {/*</Navigator>*/}
          <div className='linear'>
            <div className = 'COCRDUP_CCRDUPA'>
                <div className = 'TRNNAME' ref = { TRNNAMERef }>{ COCRDUP_CCRDUPAStore.TRNNAME }</div>
                <div className = 'TITLE01' ref = { TITLE01Ref }>{ COCRDUP_CCRDUPAStore.TITLE01 }</div>
                <div className = 'CURDATE' ref = { CURDATERef }>{ COCRDUP_CCRDUPAStore.CURDATE }</div>
                <div className = 'PGMNAME' ref = { PGMNAMERef }>{ COCRDUP_CCRDUPAStore.PGMNAME }</div>
                <div className = 'TITLE02' ref = { TITLE02Ref }>{ COCRDUP_CCRDUPAStore.TITLE02 }</div>
                <div className = 'CURTIME' ref = { CURTIMERef }>{ COCRDUP_CCRDUPAStore.CURTIME }</div>
                <div className = 'EXPDAY' ref = { EXPDAYRef }>{ COCRDUP_CCRDUPAStore.EXPDAY }</div>
                <div className = 'INFOMSG' ref = { INFOMSGRef }>{ COCRDUP_CCRDUPAStore.INFOMSG }</div>
                <div className = 'ERRMSG' ref = { ERRMSGRef }>{ COCRDUP_CCRDUPAStore.ERRMSG }</div>
                <div className = 'FKEYS' ref = { FKEYSRef }>{ COCRDUP_CCRDUPAStore.FKEYS }</div>
                <div className = 'FKEYSC' ref = { FKEYSCRef }>{ COCRDUP_CCRDUPAStore.FKEYSC }</div>
                <input className = 'CARDSID'
                       type = 'text'
                       name = 'CARDSID'
                       value = { COCRDUP_CCRDUPAStore.CARDSID  || ''  }
                       onChange = { onKeyPressedCARDSID }
                       ref = { CARDSIDRef }
                ></input>
                <input className = 'CRDNAME'
                       type = 'text'
                       name = 'CRDNAME'
                       value = { COCRDUP_CCRDUPAStore.CRDNAME  || ''  }
                       onChange = { onKeyPressedCRDNAME }
                       ref = { CRDNAMERef }
                ></input>
                <input className = 'CRDSTCD'
                       type = 'text'
                       name = 'CRDSTCD'
                       value = { COCRDUP_CCRDUPAStore.CRDSTCD  || ''  }
                       onChange = { onKeyPressedCRDSTCD }
                       ref = { CRDSTCDRef }
                ></input>
                <input className = 'EXPMON'
                       type = 'text'
                       name = 'EXPMON'
                       value = { COCRDUP_CCRDUPAStore.EXPMON  || ''  }
                       onChange = { onKeyPressedEXPMON }
                       ref = { EXPMONRef }
                ></input>
                <input className = 'ACCTSID'
                       type = 'text'
                       name = 'ACCTSID'
                       value = { COCRDUP_CCRDUPAStore.ACCTSID  || ''  }
                       onChange = { onKeyPressedACCTSID }
                       ref = { ACCTSIDRef }
                       maxLength = { 11.0 }
                ></input>
                <input className = 'EXPYEAR'
                       type = 'text'
                       name = 'EXPYEAR'
                       value = { COCRDUP_CCRDUPAStore.EXPYEAR  || ''  }
                       onChange = { onKeyPressedEXPYEAR }
                       ref = { EXPYEARRef }
                       maxLength = { 4.0 }
                ></input>
                <div className = '_field798'>Tran:</div>
                <div className = '_field801'>Date:</div>
                <div className = '_field803'>Prog:</div>
                <div className = '_field806'>Time:</div>
                <div className = '_field808'>Update Credit Card Details</div>
                <div className = '_field809'>Account Number    :</div>
                <div className = '_field811'></div>
                <div className = '_field812'>Card Number       :</div>
                <div className = '_field814'></div>
                <div className = '_field815'>Name on card      :</div>
                <div className = '_field817'></div>
                <div className = '_field818'>Card Active Y/N   : </div>
                <div className = '_field820'></div>
                <div className = '_field821'>Expiry Date       : </div>
                <div className = '_field823'>/</div>
                <div className = '_field825'></div>
                <div className = '_field827'></div>
            </div>
          </div>
        </div>
    );
});
export default COCRDUP_CCRDUPAView;


