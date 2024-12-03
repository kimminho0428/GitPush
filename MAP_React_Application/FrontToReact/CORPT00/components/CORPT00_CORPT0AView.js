import React, {useState, useEffect, useRef, forwardRef} from 'react';
import '../runtime/Lineare.scss';
import '../ui/CORPT00_CORPT0A.scss';
import '../runtime/LayoutTemplate.scss';
import useStore from "../store/UseStore";

const CORPT00_CORPT0AView = forwardRef((props) => {
    const { CORPT00_CORPT0AStore } = useStore();
    const {location, MONTHLYRef, onKeyPressedMONTHLY, YEARLYRef, onKeyPressedYEARLY, CUSTOMRef, onKeyPressedCUSTOM, SDTMMRef, onKeyPressedSDTMM, SDTDDRef, onKeyPressedSDTDD, SDTYYYYRef, onKeyPressedSDTYYYY, EDTMMRef, onKeyPressedEDTMM, EDTDDRef, onKeyPressedEDTDD, EDTYYYYRef, onKeyPressedEDTYYYY, CONFIRMRef, onKeyPressedCONFIRM , TRNNAMERef, TITLE01Ref, CURDATERef, PGMNAMERef, TITLE02Ref, CURTIMERef, ERRMSGRef } = props;

    return (
        <div className='LayoutTemplate'>
          {/*<Navigator termId={termId}>*/}
          {/*  <Logout startCode={startCode} termId={termId} path={path}/>*/}
          {/*</Navigator>*/}
          <div className='linear'>
            <div className = 'CORPT00_CORPT0A'>
                <div className = 'TRNNAME' ref = { TRNNAMERef }>{ CORPT00_CORPT0AStore.TRNNAME }</div>
                <div className = 'TITLE01' ref = { TITLE01Ref }>{ CORPT00_CORPT0AStore.TITLE01 }</div>
                <div className = 'CURDATE' ref = { CURDATERef }>{ CORPT00_CORPT0AStore.CURDATE }</div>
                <div className = 'PGMNAME' ref = { PGMNAMERef }>{ CORPT00_CORPT0AStore.PGMNAME }</div>
                <div className = 'TITLE02' ref = { TITLE02Ref }>{ CORPT00_CORPT0AStore.TITLE02 }</div>
                <div className = 'CURTIME' ref = { CURTIMERef }>{ CORPT00_CORPT0AStore.CURTIME }</div>
                <div className = 'ERRMSG' ref = { ERRMSGRef }>{ CORPT00_CORPT0AStore.ERRMSG }</div>
                <input className = 'MONTHLY'
                       type = 'text'
                       name = 'MONTHLY'
                       value = { CORPT00_CORPT0AStore.MONTHLY  || ''  }
                       onChange = { onKeyPressedMONTHLY }
                       ref = { MONTHLYRef }
                       maxLength = { 1.0 }
                ></input>
                <input className = 'YEARLY'
                       type = 'text'
                       name = 'YEARLY'
                       value = { CORPT00_CORPT0AStore.YEARLY  || ''  }
                       onChange = { onKeyPressedYEARLY }
                       ref = { YEARLYRef }
                       maxLength = { 1.0 }
                ></input>
                <input className = 'CUSTOM'
                       type = 'text'
                       name = 'CUSTOM'
                       value = { CORPT00_CORPT0AStore.CUSTOM  || ''  }
                       onChange = { onKeyPressedCUSTOM }
                       ref = { CUSTOMRef }
                       maxLength = { 1.0 }
                ></input>
                <input className = 'SDTMM'
                       type = 'number'
                       name = 'SDTMM'
                       value = { CORPT00_CORPT0AStore.SDTMM  || ''  }
                       onChange = { onKeyPressedSDTMM }
                       ref = { SDTMMRef }
                       maxLength = { 2.0 }
                ></input>
                <input className = 'SDTDD'
                       type = 'number'
                       name = 'SDTDD'
                       value = { CORPT00_CORPT0AStore.SDTDD  || ''  }
                       onChange = { onKeyPressedSDTDD }
                       ref = { SDTDDRef }
                       maxLength = { 2.0 }
                ></input>
                <input className = 'SDTYYYY'
                       type = 'number'
                       name = 'SDTYYYY'
                       value = { CORPT00_CORPT0AStore.SDTYYYY  || ''  }
                       onChange = { onKeyPressedSDTYYYY }
                       ref = { SDTYYYYRef }
                       maxLength = { 4.0 }
                ></input>
                <input className = 'EDTMM'
                       type = 'number'
                       name = 'EDTMM'
                       value = { CORPT00_CORPT0AStore.EDTMM  || ''  }
                       onChange = { onKeyPressedEDTMM }
                       ref = { EDTMMRef }
                       maxLength = { 2.0 }
                ></input>
                <input className = 'EDTDD'
                       type = 'number'
                       name = 'EDTDD'
                       value = { CORPT00_CORPT0AStore.EDTDD  || ''  }
                       onChange = { onKeyPressedEDTDD }
                       ref = { EDTDDRef }
                       maxLength = { 2.0 }
                ></input>
                <input className = 'EDTYYYY'
                       type = 'number'
                       name = 'EDTYYYY'
                       value = { CORPT00_CORPT0AStore.EDTYYYY  || ''  }
                       onChange = { onKeyPressedEDTYYYY }
                       ref = { EDTYYYYRef }
                       maxLength = { 4.0 }
                ></input>
                <input className = 'CONFIRM'
                       type = 'text'
                       name = 'CONFIRM'
                       value = { CORPT00_CORPT0AStore.CONFIRM  || ''  }
                       onChange = { onKeyPressedCONFIRM }
                       ref = { CONFIRMRef }
                       maxLength = { 1.0 }
                ></input>
                <div className = '_field507'>Tran:</div>
                <div className = '_field510'>Date:</div>
                <div className = '_field512'>Prog:</div>
                <div className = '_field515'>Time:</div>
                <div className = '_field517'>Transaction Reports</div>
                <div className = '_field519'></div>
                <div className = '_field520'>Monthly (Current Month)</div>
                <div className = '_field522'></div>
                <div className = '_field523'>Yearly (Current Year)</div>
                <div className = '_field525'></div>
                <div className = '_field526'>Custom (Date Range)</div>
                <div className = '_field527'>Start Date :</div>
                <div className = '_field529'>/</div>
                <div className = '_field531'>/</div>
                <div className = '_field533'></div>
                <div className = '_field534'>(MM/DD/YYYY)</div>
                <div className = '_field535'>  End Date :</div>
                <div className = '_field537'>/</div>
                <div className = '_field539'>/</div>
                <div className = '_field541'></div>
                <div className = '_field542'>(MM/DD/YYYY)</div>
                <div className = '_field543'>The Report will be submitted for printing. Please confirm: </div>
                <div className = '_field545'></div>
                <div className = '_field546'>(Y/N)</div>
                <div className = '_field548'>ENTER=Continue  F3=Back</div>
            </div>
          </div>
        </div>
    );
});
export default CORPT00_CORPT0AView;


