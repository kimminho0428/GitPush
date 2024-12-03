import React, {useState, useEffect, useRef, forwardRef} from 'react';
import '../runtime/Lineare.scss';
import '../ui/COCRDLI_CCRDLIA.scss';
import '../runtime/LayoutTemplate.scss';
import useStore from "../store/UseStore";

const COCRDLI_CCRDLIAView = forwardRef((props) => {
    const { COCRDLI_CCRDLIAStore } = useStore();
    const {location, ACCTSIDRef, onKeyPressedACCTSID, CARDSIDRef, onKeyPressedCARDSID, CRDSEL1Ref, onKeyPressedCRDSEL1, CRDSEL2Ref, onKeyPressedCRDSEL2, CRDSEL3Ref, onKeyPressedCRDSEL3, CRDSEL4Ref, onKeyPressedCRDSEL4, CRDSEL5Ref, onKeyPressedCRDSEL5, CRDSEL6Ref, onKeyPressedCRDSEL6, CRDSEL7Ref, onKeyPressedCRDSEL7 , TRNNAMERef, TITLE01Ref, CURDATERef, PGMNAMERef, TITLE02Ref, CURTIMERef, PAGENORef, ACCTNO1Ref, CRDNUM1Ref, CRDSTS1Ref, CRDSTP2Ref, ACCTNO2Ref, CRDNUM2Ref, CRDSTS2Ref, CRDSTP3Ref, ACCTNO3Ref, CRDNUM3Ref, CRDSTS3Ref, CRDSTP4Ref, ACCTNO4Ref, CRDNUM4Ref, CRDSTS4Ref, CRDSTP5Ref, ACCTNO5Ref, CRDNUM5Ref, CRDSTS5Ref, CRDSTP6Ref, ACCTNO6Ref, CRDNUM6Ref, CRDSTS6Ref, CRDSTP7Ref, ACCTNO7Ref, CRDNUM7Ref, CRDSTS7Ref, INFOMSGRef, ERRMSGRef } = props;

    return (
        <div className='LayoutTemplate'>
          {/*<Navigator termId={termId}>*/}
          {/*  <Logout startCode={startCode} termId={termId} path={path}/>*/}
          {/*</Navigator>*/}
          <div className='linear'>
            <div className = 'COCRDLI_CCRDLIA'>
                <div className = 'TRNNAME' ref = { TRNNAMERef }>{ COCRDLI_CCRDLIAStore.TRNNAME }</div>
                <div className = 'TITLE01' ref = { TITLE01Ref }>{ COCRDLI_CCRDLIAStore.TITLE01 }</div>
                <div className = 'CURDATE' ref = { CURDATERef }>{ COCRDLI_CCRDLIAStore.CURDATE }</div>
                <div className = 'PGMNAME' ref = { PGMNAMERef }>{ COCRDLI_CCRDLIAStore.PGMNAME }</div>
                <div className = 'TITLE02' ref = { TITLE02Ref }>{ COCRDLI_CCRDLIAStore.TITLE02 }</div>
                <div className = 'CURTIME' ref = { CURTIMERef }>{ COCRDLI_CCRDLIAStore.CURTIME }</div>
                <div className = 'PAGENO' ref = { PAGENORef }>{ COCRDLI_CCRDLIAStore.PAGENO }</div>
                <div className = 'ACCTNO1' ref = { ACCTNO1Ref }>{ COCRDLI_CCRDLIAStore.ACCTNO1 }</div>
                <div className = 'CRDNUM1' ref = { CRDNUM1Ref }>{ COCRDLI_CCRDLIAStore.CRDNUM1 }</div>
                <div className = 'CRDSTS1' ref = { CRDSTS1Ref }>{ COCRDLI_CCRDLIAStore.CRDSTS1 }</div>
                <div className = 'CRDSTP2' ref = { CRDSTP2Ref }>{ COCRDLI_CCRDLIAStore.CRDSTP2 }</div>
                <div className = 'ACCTNO2' ref = { ACCTNO2Ref }>{ COCRDLI_CCRDLIAStore.ACCTNO2 }</div>
                <div className = 'CRDNUM2' ref = { CRDNUM2Ref }>{ COCRDLI_CCRDLIAStore.CRDNUM2 }</div>
                <div className = 'CRDSTS2' ref = { CRDSTS2Ref }>{ COCRDLI_CCRDLIAStore.CRDSTS2 }</div>
                <div className = 'CRDSTP3' ref = { CRDSTP3Ref }>{ COCRDLI_CCRDLIAStore.CRDSTP3 }</div>
                <div className = 'ACCTNO3' ref = { ACCTNO3Ref }>{ COCRDLI_CCRDLIAStore.ACCTNO3 }</div>
                <div className = 'CRDNUM3' ref = { CRDNUM3Ref }>{ COCRDLI_CCRDLIAStore.CRDNUM3 }</div>
                <div className = 'CRDSTS3' ref = { CRDSTS3Ref }>{ COCRDLI_CCRDLIAStore.CRDSTS3 }</div>
                <div className = 'CRDSTP4' ref = { CRDSTP4Ref }>{ COCRDLI_CCRDLIAStore.CRDSTP4 }</div>
                <div className = 'ACCTNO4' ref = { ACCTNO4Ref }>{ COCRDLI_CCRDLIAStore.ACCTNO4 }</div>
                <div className = 'CRDNUM4' ref = { CRDNUM4Ref }>{ COCRDLI_CCRDLIAStore.CRDNUM4 }</div>
                <div className = 'CRDSTS4' ref = { CRDSTS4Ref }>{ COCRDLI_CCRDLIAStore.CRDSTS4 }</div>
                <div className = 'CRDSTP5' ref = { CRDSTP5Ref }>{ COCRDLI_CCRDLIAStore.CRDSTP5 }</div>
                <div className = 'ACCTNO5' ref = { ACCTNO5Ref }>{ COCRDLI_CCRDLIAStore.ACCTNO5 }</div>
                <div className = 'CRDNUM5' ref = { CRDNUM5Ref }>{ COCRDLI_CCRDLIAStore.CRDNUM5 }</div>
                <div className = 'CRDSTS5' ref = { CRDSTS5Ref }>{ COCRDLI_CCRDLIAStore.CRDSTS5 }</div>
                <div className = 'CRDSTP6' ref = { CRDSTP6Ref }>{ COCRDLI_CCRDLIAStore.CRDSTP6 }</div>
                <div className = 'ACCTNO6' ref = { ACCTNO6Ref }>{ COCRDLI_CCRDLIAStore.ACCTNO6 }</div>
                <div className = 'CRDNUM6' ref = { CRDNUM6Ref }>{ COCRDLI_CCRDLIAStore.CRDNUM6 }</div>
                <div className = 'CRDSTS6' ref = { CRDSTS6Ref }>{ COCRDLI_CCRDLIAStore.CRDSTS6 }</div>
                <div className = 'CRDSTP7' ref = { CRDSTP7Ref }>{ COCRDLI_CCRDLIAStore.CRDSTP7 }</div>
                <div className = 'ACCTNO7' ref = { ACCTNO7Ref }>{ COCRDLI_CCRDLIAStore.ACCTNO7 }</div>
                <div className = 'CRDNUM7' ref = { CRDNUM7Ref }>{ COCRDLI_CCRDLIAStore.CRDNUM7 }</div>
                <div className = 'CRDSTS7' ref = { CRDSTS7Ref }>{ COCRDLI_CCRDLIAStore.CRDSTS7 }</div>
                <div className = 'INFOMSG' ref = { INFOMSGRef }>{ COCRDLI_CCRDLIAStore.INFOMSG }</div>
                <div className = 'ERRMSG' ref = { ERRMSGRef }>{ COCRDLI_CCRDLIAStore.ERRMSG }</div>
                <input className = 'CARDSID'
                       type = 'text'
                       name = 'CARDSID'
                       value = { COCRDLI_CCRDLIAStore.CARDSID  || ''  }
                       onChange = { onKeyPressedCARDSID }
                       ref = { CARDSIDRef }
                ></input>
                <input className = 'CRDSEL1'
                       type = 'text'
                       name = 'CRDSEL1'
                       value = { COCRDLI_CCRDLIAStore.CRDSEL1  || ''  }
                       onChange = { onKeyPressedCRDSEL1 }
                       ref = { CRDSEL1Ref }
                ></input>
                <input className = 'ACCTSID'
                       type = 'text'
                       name = 'ACCTSID'
                       value = { COCRDLI_CCRDLIAStore.ACCTSID  || ''  }
                       onChange = { onKeyPressedACCTSID }
                       ref = { ACCTSIDRef }
                       maxLength = { 11.0 }
                ></input>
                <input className = 'CRDSEL2'
                       type = 'text'
                       name = 'CRDSEL2'
                       value = { COCRDLI_CCRDLIAStore.CRDSEL2  || ''  }
                       onChange = { onKeyPressedCRDSEL2 }
                       ref = { CRDSEL2Ref }
                       maxLength = { 1.0 }
                ></input>
                <input className = 'CRDSEL3'
                       type = 'text'
                       name = 'CRDSEL3'
                       value = { COCRDLI_CCRDLIAStore.CRDSEL3  || ''  }
                       onChange = { onKeyPressedCRDSEL3 }
                       ref = { CRDSEL3Ref }
                       maxLength = { 1.0 }
                ></input>
                <input className = 'CRDSEL4'
                       type = 'text'
                       name = 'CRDSEL4'
                       value = { COCRDLI_CCRDLIAStore.CRDSEL4  || ''  }
                       onChange = { onKeyPressedCRDSEL4 }
                       ref = { CRDSEL4Ref }
                       maxLength = { 1.0 }
                ></input>
                <input className = 'CRDSEL5'
                       type = 'text'
                       name = 'CRDSEL5'
                       value = { COCRDLI_CCRDLIAStore.CRDSEL5  || ''  }
                       onChange = { onKeyPressedCRDSEL5 }
                       ref = { CRDSEL5Ref }
                       maxLength = { 1.0 }
                ></input>
                <input className = 'CRDSEL6'
                       type = 'text'
                       name = 'CRDSEL6'
                       value = { COCRDLI_CCRDLIAStore.CRDSEL6  || ''  }
                       onChange = { onKeyPressedCRDSEL6 }
                       ref = { CRDSEL6Ref }
                       maxLength = { 1.0 }
                ></input>
                <input className = 'CRDSEL7'
                       type = 'text'
                       name = 'CRDSEL7'
                       value = { COCRDLI_CCRDLIAStore.CRDSEL7  || ''  }
                       onChange = { onKeyPressedCRDSEL7 }
                       ref = { CRDSEL7Ref }
                       maxLength = { 1.0 }
                ></input>
                <div className = '_field667'>Tran:</div>
                <div className = '_field670'>Date:</div>
                <div className = '_field672'>Prog:</div>
                <div className = '_field675'>Time:</div>
                <div className = '_field677'>List Credit Cards</div>
                <div className = '_field678'>Page </div>
                <div className = '_field680'>Account Number    :</div>
                <div className = '_field682'></div>
                <div className = '_field683'>Credit Card Number:</div>
                <div className = '_field685'></div>
                <div className = '_field686'>Select    </div>
                <div className = '_field687'>Account Number</div>
                <div className = '_field688'> Card Number </div>
                <div className = '_field689'>Active </div>
                <div className = '_field690'>------</div>
                <div className = '_field691'>---------------</div>
                <div className = '_field692'>---------------</div>
                <div className = '_field693'>--------</div>
                <div className = '_field695'></div>
                <div className = '_field700'></div>
                <div className = '_field706'></div>
                <div className = '_field712'></div>
                <div className = '_field718'></div>
                <div className = '_field724'></div>
                <div className = '_field730'></div>
                <div className = '_field736'></div>
                <div className = '_field738'>  F3=Exit F7=Backward  F8=Forward</div>
            </div>
          </div>
        </div>
    );
});
export default COCRDLI_CCRDLIAView;


