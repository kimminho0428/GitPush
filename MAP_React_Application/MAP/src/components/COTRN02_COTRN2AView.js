import React, {useState, useEffect, useRef, forwardRef} from 'react';
import '../runtime/Lineare.scss';
import '../ui/COTRN02_COTRN2A.scss';
import '../runtime/LayoutTemplate.scss';
import useStore from "../store/UseStore";

const COTRN02_COTRN2AView = forwardRef((props) => {
    const { COTRN02_COTRN2AStore } = useStore();
    const {location, ACTIDINRef, onKeyPressedACTIDIN, CARDNINRef, onKeyPressedCARDNIN, TTYPCDRef, onKeyPressedTTYPCD, TCATCDRef, onKeyPressedTCATCD, TRNSRCRef, onKeyPressedTRNSRC, TDESCRef, onKeyPressedTDESC, TRNAMTRef, onKeyPressedTRNAMT, TORIGDTRef, onKeyPressedTORIGDT, TPROCDTRef, onKeyPressedTPROCDT, MIDRef, onKeyPressedMID, MNAMERef, onKeyPressedMNAME, MCITYRef, onKeyPressedMCITY, MZIPRef, onKeyPressedMZIP, CONFIRMRef, onKeyPressedCONFIRM , TRNNAMERef, TITLE01Ref, CURDATERef, PGMNAMERef, TITLE02Ref, CURTIMERef, ERRMSGRef } = props;

    return (
        <div className='LayoutTemplate'>
          {/*<Navigator termId={termId}>*/}
          {/*  <Logout startCode={startCode} termId={termId} path={path}/>*/}
          {/*</Navigator>*/}
          <div className='linear'>
            <div className = 'COTRN02_COTRN2A'>
                <div className = 'TRNNAME' ref = { TRNNAMERef }>{ COTRN02_COTRN2AStore.TRNNAME }</div>
                <div className = 'TITLE01' ref = { TITLE01Ref }>{ COTRN02_COTRN2AStore.TITLE01 }</div>
                <div className = 'CURDATE' ref = { CURDATERef }>{ COTRN02_COTRN2AStore.CURDATE }</div>
                <div className = 'PGMNAME' ref = { PGMNAMERef }>{ COTRN02_COTRN2AStore.PGMNAME }</div>
                <div className = 'TITLE02' ref = { TITLE02Ref }>{ COTRN02_COTRN2AStore.TITLE02 }</div>
                <div className = 'CURTIME' ref = { CURTIMERef }>{ COTRN02_COTRN2AStore.CURTIME }</div>
                <div className = 'ERRMSG' ref = { ERRMSGRef }>{ COTRN02_COTRN2AStore.ERRMSG }</div>
                <input className = 'ACTIDIN'
                       type = 'text'
                       name = 'ACTIDIN'
                       value = { COTRN02_COTRN2AStore.ACTIDIN  || ''  }
                       onChange = { onKeyPressedACTIDIN }
                       ref = { ACTIDINRef }
                       maxLength = { 11.0 }
                ></input>
                <input className = 'CARDNIN'
                       type = 'text'
                       name = 'CARDNIN'
                       value = { COTRN02_COTRN2AStore.CARDNIN  || ''  }
                       onChange = { onKeyPressedCARDNIN }
                       ref = { CARDNINRef }
                       maxLength = { 16.0 }
                ></input>
                <input className = 'TTYPCD'
                       type = 'text'
                       name = 'TTYPCD'
                       value = { COTRN02_COTRN2AStore.TTYPCD  || ''  }
                       onChange = { onKeyPressedTTYPCD }
                       ref = { TTYPCDRef }
                       maxLength = { 2.0 }
                ></input>
                <input className = 'TCATCD'
                       type = 'text'
                       name = 'TCATCD'
                       value = { COTRN02_COTRN2AStore.TCATCD  || ''  }
                       onChange = { onKeyPressedTCATCD }
                       ref = { TCATCDRef }
                       maxLength = { 4.0 }
                ></input>
                <input className = 'TRNSRC'
                       type = 'text'
                       name = 'TRNSRC'
                       value = { COTRN02_COTRN2AStore.TRNSRC  || ''  }
                       onChange = { onKeyPressedTRNSRC }
                       ref = { TRNSRCRef }
                       maxLength = { 10.0 }
                ></input>
                <input className = 'TDESC'
                       type = 'text'
                       name = 'TDESC'
                       value = { COTRN02_COTRN2AStore.TDESC  || ''  }
                       onChange = { onKeyPressedTDESC }
                       ref = { TDESCRef }
                       maxLength = { 60.0 }
                ></input>
                <input className = 'TRNAMT'
                       type = 'text'
                       name = 'TRNAMT'
                       value = { COTRN02_COTRN2AStore.TRNAMT  || ''  }
                       onChange = { onKeyPressedTRNAMT }
                       ref = { TRNAMTRef }
                       maxLength = { 12.0 }
                ></input>
                <input className = 'TORIGDT'
                       type = 'text'
                       name = 'TORIGDT'
                       value = { COTRN02_COTRN2AStore.TORIGDT  || ''  }
                       onChange = { onKeyPressedTORIGDT }
                       ref = { TORIGDTRef }
                       maxLength = { 10.0 }
                ></input>
                <input className = 'TPROCDT'
                       type = 'text'
                       name = 'TPROCDT'
                       value = { COTRN02_COTRN2AStore.TPROCDT  || ''  }
                       onChange = { onKeyPressedTPROCDT }
                       ref = { TPROCDTRef }
                       maxLength = { 10.0 }
                ></input>
                <input className = 'MID'
                       type = 'text'
                       name = 'MID'
                       value = { COTRN02_COTRN2AStore.MID  || ''  }
                       onChange = { onKeyPressedMID }
                       ref = { MIDRef }
                       maxLength = { 9.0 }
                ></input>
                <input className = 'MNAME'
                       type = 'text'
                       name = 'MNAME'
                       value = { COTRN02_COTRN2AStore.MNAME  || ''  }
                       onChange = { onKeyPressedMNAME }
                       ref = { MNAMERef }
                       maxLength = { 30.0 }
                ></input>
                <input className = 'MCITY'
                       type = 'text'
                       name = 'MCITY'
                       value = { COTRN02_COTRN2AStore.MCITY  || ''  }
                       onChange = { onKeyPressedMCITY }
                       ref = { MCITYRef }
                       maxLength = { 25.0 }
                ></input>
                <input className = 'MZIP'
                       type = 'text'
                       name = 'MZIP'
                       value = { COTRN02_COTRN2AStore.MZIP  || ''  }
                       onChange = { onKeyPressedMZIP }
                       ref = { MZIPRef }
                       maxLength = { 10.0 }
                ></input>
                <input className = 'CONFIRM'
                       type = 'text'
                       name = 'CONFIRM'
                       value = { COTRN02_COTRN2AStore.CONFIRM  || ''  }
                       onChange = { onKeyPressedCONFIRM }
                       ref = { CONFIRMRef }
                       maxLength = { 1.0 }
                ></input>
                <div className = '_field120'>Tran:</div>
                <div className = '_field123'>Date:</div>
                <div className = '_field125'>Prog:</div>
                <div className = '_field128'>Time:</div>
                <div className = '_field130'>Add Transaction</div>
                <div className = '_field131'>Enter Acct #:</div>
                <div className = '_field133'></div>
                <div className = '_field134'>(or)</div>
                <div className = '_field135'>Card #:</div>
                <div className = '_field137'></div>
                <div className = '_field138'>----------------------------------------------------------------------</div>
                <div className = '_field139'>Type CD:</div>
                <div className = '_field141'></div>
                <div className = '_field142'>Category CD:</div>
                <div className = '_field144'></div>
                <div className = '_field145'>Source:</div>
                <div className = '_field147'></div>
                <div className = '_field148'>Description:</div>
                <div className = '_field150'></div>
                <div className = '_field151'>Amount:</div>
                <div className = '_field153'></div>
                <div className = '_field154'>Orig Date:</div>
                <div className = '_field156'></div>
                <div className = '_field157'>Proc Date:</div>
                <div className = '_field159'></div>
                <div className = '_field160'>(-99999999.99)</div>
                <div className = '_field161'>(YYYY-MM-DD)</div>
                <div className = '_field162'>(YYYY-MM-DD)</div>
                <div className = '_field163'>Merchant ID:</div>
                <div className = '_field165'></div>
                <div className = '_field166'>Merchant Name:</div>
                <div className = '_field168'></div>
                <div className = '_field169'>Merchant City:</div>
                <div className = '_field171'></div>
                <div className = '_field172'>Merchant Zip:</div>
                <div className = '_field174'></div>
                <div className = '_field175'>You are about to add this transaction. Please confirm :</div>
                <div className = '_field177'></div>
                <div className = '_field178'>(Y/N)</div>
                <div className = '_field180'>ENTER=Continue  F3=Back  F4=Clear  F5=Copy Last Tran.</div>
            </div>
          </div>
        </div>
    );
});
export default COTRN02_COTRN2AView;


