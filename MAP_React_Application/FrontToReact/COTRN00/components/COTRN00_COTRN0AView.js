import React, {useState, useEffect, useRef, forwardRef} from 'react';
import '../runtime/Lineare.scss';
import '../ui/COTRN00_COTRN0A.scss';
import '../runtime/LayoutTemplate.scss';
import useStore from "../store/UseStore";

const COTRN00_COTRN0AView = forwardRef((props) => {
    const { COTRN00_COTRN0AStore } = useStore();
    const {location, TRNIDINRef, onKeyPressedTRNIDIN, SEL0001Ref, onKeyPressedSEL0001, SEL0002Ref, onKeyPressedSEL0002, SEL0003Ref, onKeyPressedSEL0003, SEL0004Ref, onKeyPressedSEL0004, SEL0005Ref, onKeyPressedSEL0005, SEL0006Ref, onKeyPressedSEL0006, SEL0007Ref, onKeyPressedSEL0007, SEL0008Ref, onKeyPressedSEL0008, SEL0009Ref, onKeyPressedSEL0009, SEL0010Ref, onKeyPressedSEL0010 , TRNNAMERef, TITLE01Ref, CURDATERef, PGMNAMERef, TITLE02Ref, CURTIMERef, PAGENUMRef, TRNID01Ref, TDATE01Ref, TDESC01Ref, TAMT001Ref, TRNID02Ref, TDATE02Ref, TDESC02Ref, TAMT002Ref, TRNID03Ref, TDATE03Ref, TDESC03Ref, TAMT003Ref, TRNID04Ref, TDATE04Ref, TDESC04Ref, TAMT004Ref, TRNID05Ref, TDATE05Ref, TDESC05Ref, TAMT005Ref, TRNID06Ref, TDATE06Ref, TDESC06Ref, TAMT006Ref, TRNID07Ref, TDATE07Ref, TDESC07Ref, TAMT007Ref, TRNID08Ref, TDATE08Ref, TDESC08Ref, TAMT008Ref, TRNID09Ref, TDATE09Ref, TDESC09Ref, TAMT009Ref, TRNID10Ref, TDATE10Ref, TDESC10Ref, TAMT010Ref, ERRMSGRef } = props;

    return (
        <div className='LayoutTemplate'>
          {/*<Navigator termId={termId}>*/}
          {/*  <Logout startCode={startCode} termId={termId} path={path}/>*/}
          {/*</Navigator>*/}
          <div className='linear'>
            <div className = 'COTRN00_COTRN0A'>
                <div className = 'TRNNAME' ref = { TRNNAMERef }>{ COTRN00_COTRN0AStore.TRNNAME }</div>
                <div className = 'TITLE01' ref = { TITLE01Ref }>{ COTRN00_COTRN0AStore.TITLE01 }</div>
                <div className = 'CURDATE' ref = { CURDATERef }>{ COTRN00_COTRN0AStore.CURDATE }</div>
                <div className = 'PGMNAME' ref = { PGMNAMERef }>{ COTRN00_COTRN0AStore.PGMNAME }</div>
                <div className = 'TITLE02' ref = { TITLE02Ref }>{ COTRN00_COTRN0AStore.TITLE02 }</div>
                <div className = 'CURTIME' ref = { CURTIMERef }>{ COTRN00_COTRN0AStore.CURTIME }</div>
                <div className = 'PAGENUM' ref = { PAGENUMRef }>{ COTRN00_COTRN0AStore.PAGENUM }</div>
                <div className = 'TRNID01' ref = { TRNID01Ref }>{ COTRN00_COTRN0AStore.TRNID01 }</div>
                <div className = 'TDATE01' ref = { TDATE01Ref }>{ COTRN00_COTRN0AStore.TDATE01 }</div>
                <div className = 'TDESC01' ref = { TDESC01Ref }>{ COTRN00_COTRN0AStore.TDESC01 }</div>
                <div className = 'TAMT001' ref = { TAMT001Ref }>{ COTRN00_COTRN0AStore.TAMT001 }</div>
                <div className = 'TRNID02' ref = { TRNID02Ref }>{ COTRN00_COTRN0AStore.TRNID02 }</div>
                <div className = 'TDATE02' ref = { TDATE02Ref }>{ COTRN00_COTRN0AStore.TDATE02 }</div>
                <div className = 'TDESC02' ref = { TDESC02Ref }>{ COTRN00_COTRN0AStore.TDESC02 }</div>
                <div className = 'TAMT002' ref = { TAMT002Ref }>{ COTRN00_COTRN0AStore.TAMT002 }</div>
                <div className = 'TRNID03' ref = { TRNID03Ref }>{ COTRN00_COTRN0AStore.TRNID03 }</div>
                <div className = 'TDATE03' ref = { TDATE03Ref }>{ COTRN00_COTRN0AStore.TDATE03 }</div>
                <div className = 'TDESC03' ref = { TDESC03Ref }>{ COTRN00_COTRN0AStore.TDESC03 }</div>
                <div className = 'TAMT003' ref = { TAMT003Ref }>{ COTRN00_COTRN0AStore.TAMT003 }</div>
                <div className = 'TRNID04' ref = { TRNID04Ref }>{ COTRN00_COTRN0AStore.TRNID04 }</div>
                <div className = 'TDATE04' ref = { TDATE04Ref }>{ COTRN00_COTRN0AStore.TDATE04 }</div>
                <div className = 'TDESC04' ref = { TDESC04Ref }>{ COTRN00_COTRN0AStore.TDESC04 }</div>
                <div className = 'TAMT004' ref = { TAMT004Ref }>{ COTRN00_COTRN0AStore.TAMT004 }</div>
                <div className = 'TRNID05' ref = { TRNID05Ref }>{ COTRN00_COTRN0AStore.TRNID05 }</div>
                <div className = 'TDATE05' ref = { TDATE05Ref }>{ COTRN00_COTRN0AStore.TDATE05 }</div>
                <div className = 'TDESC05' ref = { TDESC05Ref }>{ COTRN00_COTRN0AStore.TDESC05 }</div>
                <div className = 'TAMT005' ref = { TAMT005Ref }>{ COTRN00_COTRN0AStore.TAMT005 }</div>
                <div className = 'TRNID06' ref = { TRNID06Ref }>{ COTRN00_COTRN0AStore.TRNID06 }</div>
                <div className = 'TDATE06' ref = { TDATE06Ref }>{ COTRN00_COTRN0AStore.TDATE06 }</div>
                <div className = 'TDESC06' ref = { TDESC06Ref }>{ COTRN00_COTRN0AStore.TDESC06 }</div>
                <div className = 'TAMT006' ref = { TAMT006Ref }>{ COTRN00_COTRN0AStore.TAMT006 }</div>
                <div className = 'TRNID07' ref = { TRNID07Ref }>{ COTRN00_COTRN0AStore.TRNID07 }</div>
                <div className = 'TDATE07' ref = { TDATE07Ref }>{ COTRN00_COTRN0AStore.TDATE07 }</div>
                <div className = 'TDESC07' ref = { TDESC07Ref }>{ COTRN00_COTRN0AStore.TDESC07 }</div>
                <div className = 'TAMT007' ref = { TAMT007Ref }>{ COTRN00_COTRN0AStore.TAMT007 }</div>
                <div className = 'TRNID08' ref = { TRNID08Ref }>{ COTRN00_COTRN0AStore.TRNID08 }</div>
                <div className = 'TDATE08' ref = { TDATE08Ref }>{ COTRN00_COTRN0AStore.TDATE08 }</div>
                <div className = 'TDESC08' ref = { TDESC08Ref }>{ COTRN00_COTRN0AStore.TDESC08 }</div>
                <div className = 'TAMT008' ref = { TAMT008Ref }>{ COTRN00_COTRN0AStore.TAMT008 }</div>
                <div className = 'TRNID09' ref = { TRNID09Ref }>{ COTRN00_COTRN0AStore.TRNID09 }</div>
                <div className = 'TDATE09' ref = { TDATE09Ref }>{ COTRN00_COTRN0AStore.TDATE09 }</div>
                <div className = 'TDESC09' ref = { TDESC09Ref }>{ COTRN00_COTRN0AStore.TDESC09 }</div>
                <div className = 'TAMT009' ref = { TAMT009Ref }>{ COTRN00_COTRN0AStore.TAMT009 }</div>
                <div className = 'TRNID10' ref = { TRNID10Ref }>{ COTRN00_COTRN0AStore.TRNID10 }</div>
                <div className = 'TDATE10' ref = { TDATE10Ref }>{ COTRN00_COTRN0AStore.TDATE10 }</div>
                <div className = 'TDESC10' ref = { TDESC10Ref }>{ COTRN00_COTRN0AStore.TDESC10 }</div>
                <div className = 'TAMT010' ref = { TAMT010Ref }>{ COTRN00_COTRN0AStore.TAMT010 }</div>
                <div className = 'ERRMSG' ref = { ERRMSGRef }>{ COTRN00_COTRN0AStore.ERRMSG }</div>
                <input className = 'TRNIDIN'
                       type = 'text'
                       name = 'TRNIDIN'
                       value = { COTRN00_COTRN0AStore.TRNIDIN  || ''  }
                       onChange = { onKeyPressedTRNIDIN }
                       ref = { TRNIDINRef }
                       maxLength = { 16.0 }
                ></input>
                <input className = 'SEL0001'
                       type = 'text'
                       name = 'SEL0001'
                       value = { COTRN00_COTRN0AStore.SEL0001  || ''  }
                       onChange = { onKeyPressedSEL0001 }
                       ref = { SEL0001Ref }
                       maxLength = { 1.0 }
                ></input>
                <input className = 'SEL0002'
                       type = 'text'
                       name = 'SEL0002'
                       value = { COTRN00_COTRN0AStore.SEL0002  || ''  }
                       onChange = { onKeyPressedSEL0002 }
                       ref = { SEL0002Ref }
                       maxLength = { 1.0 }
                ></input>
                <input className = 'SEL0003'
                       type = 'text'
                       name = 'SEL0003'
                       value = { COTRN00_COTRN0AStore.SEL0003  || ''  }
                       onChange = { onKeyPressedSEL0003 }
                       ref = { SEL0003Ref }
                       maxLength = { 1.0 }
                ></input>
                <input className = 'SEL0004'
                       type = 'text'
                       name = 'SEL0004'
                       value = { COTRN00_COTRN0AStore.SEL0004  || ''  }
                       onChange = { onKeyPressedSEL0004 }
                       ref = { SEL0004Ref }
                       maxLength = { 1.0 }
                ></input>
                <input className = 'SEL0005'
                       type = 'text'
                       name = 'SEL0005'
                       value = { COTRN00_COTRN0AStore.SEL0005  || ''  }
                       onChange = { onKeyPressedSEL0005 }
                       ref = { SEL0005Ref }
                       maxLength = { 1.0 }
                ></input>
                <input className = 'SEL0006'
                       type = 'text'
                       name = 'SEL0006'
                       value = { COTRN00_COTRN0AStore.SEL0006  || ''  }
                       onChange = { onKeyPressedSEL0006 }
                       ref = { SEL0006Ref }
                       maxLength = { 1.0 }
                ></input>
                <input className = 'SEL0007'
                       type = 'text'
                       name = 'SEL0007'
                       value = { COTRN00_COTRN0AStore.SEL0007  || ''  }
                       onChange = { onKeyPressedSEL0007 }
                       ref = { SEL0007Ref }
                       maxLength = { 1.0 }
                ></input>
                <input className = 'SEL0008'
                       type = 'text'
                       name = 'SEL0008'
                       value = { COTRN00_COTRN0AStore.SEL0008  || ''  }
                       onChange = { onKeyPressedSEL0008 }
                       ref = { SEL0008Ref }
                       maxLength = { 1.0 }
                ></input>
                <input className = 'SEL0009'
                       type = 'text'
                       name = 'SEL0009'
                       value = { COTRN00_COTRN0AStore.SEL0009  || ''  }
                       onChange = { onKeyPressedSEL0009 }
                       ref = { SEL0009Ref }
                       maxLength = { 1.0 }
                ></input>
                <input className = 'SEL0010'
                       type = 'text'
                       name = 'SEL0010'
                       value = { COTRN00_COTRN0AStore.SEL0010  || ''  }
                       onChange = { onKeyPressedSEL0010 }
                       ref = { SEL0010Ref }
                       maxLength = { 1.0 }
                ></input>
                <div className = '_field577'>Tran:</div>
                <div className = '_field580'>Date:</div>
                <div className = '_field582'>Prog:</div>
                <div className = '_field585'>Time:</div>
                <div className = '_field587'>List Transactions</div>
                <div className = '_field588'>Page:</div>
                <div className = '_field590'>Search Tran ID:</div>
                <div className = '_field592'></div>
                <div className = '_field593'>Sel</div>
                <div className = '_field594'> Transaction ID </div>
                <div className = '_field595'>  Date  </div>
                <div className = '_field596'>     Description          </div>
                <div className = '_field597'>   Amount   </div>
                <div className = '_field598'>---</div>
                <div className = '_field599'>----------------</div>
                <div className = '_field600'>--------</div>
                <div className = '_field601'>--------------------------</div>
                <div className = '_field602'>------------</div>
                <div className = '_field604'></div>
                <div className = '_field610'></div>
                <div className = '_field616'></div>
                <div className = '_field622'></div>
                <div className = '_field628'></div>
                <div className = '_field634'></div>
                <div className = '_field640'></div>
                <div className = '_field646'></div>
                <div className = '_field652'></div>
                <div className = '_field658'></div>
                <div className = '_field663'>Type ''S'' to View Transaction details from the list</div>
                <div className = '_field665'>ENTER=Continue  F3=Back  F7=Backward  F8=Forward</div>
            </div>
          </div>
        </div>
    );
});
export default COTRN00_COTRN0AView;


