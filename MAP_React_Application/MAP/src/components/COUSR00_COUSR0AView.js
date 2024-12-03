import React, {useState, useEffect, useRef, forwardRef} from 'react';
import '../runtime/Lineare.scss';
import '../ui/COUSR00_COUSR0A.scss';
import '../runtime/LayoutTemplate.scss';
import useStore from "../store/UseStore";

const COUSR00_COUSR0AView = forwardRef((props) => {
    const { COUSR00_COUSR0AStore } = useStore();
    const {location, USRIDINRef, onKeyPressedUSRIDIN, SEL0001Ref, onKeyPressedSEL0001, SEL0002Ref, onKeyPressedSEL0002, SEL0003Ref, onKeyPressedSEL0003, SEL0004Ref, onKeyPressedSEL0004, SEL0005Ref, onKeyPressedSEL0005, SEL0006Ref, onKeyPressedSEL0006, SEL0007Ref, onKeyPressedSEL0007, SEL0008Ref, onKeyPressedSEL0008, SEL0009Ref, onKeyPressedSEL0009, SEL0010Ref, onKeyPressedSEL0010 , TRNNAMERef, TITLE01Ref, CURDATERef, PGMNAMERef, TITLE02Ref, CURTIMERef, PAGENUMRef, USRID01Ref, FNAME01Ref, LNAME01Ref, UTYPE01Ref, USRID02Ref, FNAME02Ref, LNAME02Ref, UTYPE02Ref, USRID03Ref, FNAME03Ref, LNAME03Ref, UTYPE03Ref, USRID04Ref, FNAME04Ref, LNAME04Ref, UTYPE04Ref, USRID05Ref, FNAME05Ref, LNAME05Ref, UTYPE05Ref, USRID06Ref, FNAME06Ref, LNAME06Ref, UTYPE06Ref, USRID07Ref, FNAME07Ref, LNAME07Ref, UTYPE07Ref, USRID08Ref, FNAME08Ref, LNAME08Ref, UTYPE08Ref, USRID09Ref, FNAME09Ref, LNAME09Ref, UTYPE09Ref, USRID10Ref, FNAME10Ref, LNAME10Ref, UTYPE10Ref, ERRMSGRef } = props;

    return (
        <div className='LayoutTemplate'>
          {/*<Navigator termId={termId}>*/}
          {/*  <Logout startCode={startCode} termId={termId} path={path}/>*/}
          {/*</Navigator>*/}
          <div className='linear'>
            <div className = 'COUSR00_COUSR0A'>
                <div className = 'TRNNAME' ref = { TRNNAMERef }>{ COUSR00_COUSR0AStore.TRNNAME }</div>
                <div className = 'TITLE01' ref = { TITLE01Ref }>{ COUSR00_COUSR0AStore.TITLE01 }</div>
                <div className = 'CURDATE' ref = { CURDATERef }>{ COUSR00_COUSR0AStore.CURDATE }</div>
                <div className = 'PGMNAME' ref = { PGMNAMERef }>{ COUSR00_COUSR0AStore.PGMNAME }</div>
                <div className = 'TITLE02' ref = { TITLE02Ref }>{ COUSR00_COUSR0AStore.TITLE02 }</div>
                <div className = 'CURTIME' ref = { CURTIMERef }>{ COUSR00_COUSR0AStore.CURTIME }</div>
                <div className = 'PAGENUM' ref = { PAGENUMRef }>{ COUSR00_COUSR0AStore.PAGENUM }</div>
                <div className = 'USRID01' ref = { USRID01Ref }>{ COUSR00_COUSR0AStore.USRID01 }</div>
                <div className = 'FNAME01' ref = { FNAME01Ref }>{ COUSR00_COUSR0AStore.FNAME01 }</div>
                <div className = 'LNAME01' ref = { LNAME01Ref }>{ COUSR00_COUSR0AStore.LNAME01 }</div>
                <div className = 'UTYPE01' ref = { UTYPE01Ref }>{ COUSR00_COUSR0AStore.UTYPE01 }</div>
                <div className = 'USRID02' ref = { USRID02Ref }>{ COUSR00_COUSR0AStore.USRID02 }</div>
                <div className = 'FNAME02' ref = { FNAME02Ref }>{ COUSR00_COUSR0AStore.FNAME02 }</div>
                <div className = 'LNAME02' ref = { LNAME02Ref }>{ COUSR00_COUSR0AStore.LNAME02 }</div>
                <div className = 'UTYPE02' ref = { UTYPE02Ref }>{ COUSR00_COUSR0AStore.UTYPE02 }</div>
                <div className = 'USRID03' ref = { USRID03Ref }>{ COUSR00_COUSR0AStore.USRID03 }</div>
                <div className = 'FNAME03' ref = { FNAME03Ref }>{ COUSR00_COUSR0AStore.FNAME03 }</div>
                <div className = 'LNAME03' ref = { LNAME03Ref }>{ COUSR00_COUSR0AStore.LNAME03 }</div>
                <div className = 'UTYPE03' ref = { UTYPE03Ref }>{ COUSR00_COUSR0AStore.UTYPE03 }</div>
                <div className = 'USRID04' ref = { USRID04Ref }>{ COUSR00_COUSR0AStore.USRID04 }</div>
                <div className = 'FNAME04' ref = { FNAME04Ref }>{ COUSR00_COUSR0AStore.FNAME04 }</div>
                <div className = 'LNAME04' ref = { LNAME04Ref }>{ COUSR00_COUSR0AStore.LNAME04 }</div>
                <div className = 'UTYPE04' ref = { UTYPE04Ref }>{ COUSR00_COUSR0AStore.UTYPE04 }</div>
                <div className = 'USRID05' ref = { USRID05Ref }>{ COUSR00_COUSR0AStore.USRID05 }</div>
                <div className = 'FNAME05' ref = { FNAME05Ref }>{ COUSR00_COUSR0AStore.FNAME05 }</div>
                <div className = 'LNAME05' ref = { LNAME05Ref }>{ COUSR00_COUSR0AStore.LNAME05 }</div>
                <div className = 'UTYPE05' ref = { UTYPE05Ref }>{ COUSR00_COUSR0AStore.UTYPE05 }</div>
                <div className = 'USRID06' ref = { USRID06Ref }>{ COUSR00_COUSR0AStore.USRID06 }</div>
                <div className = 'FNAME06' ref = { FNAME06Ref }>{ COUSR00_COUSR0AStore.FNAME06 }</div>
                <div className = 'LNAME06' ref = { LNAME06Ref }>{ COUSR00_COUSR0AStore.LNAME06 }</div>
                <div className = 'UTYPE06' ref = { UTYPE06Ref }>{ COUSR00_COUSR0AStore.UTYPE06 }</div>
                <div className = 'USRID07' ref = { USRID07Ref }>{ COUSR00_COUSR0AStore.USRID07 }</div>
                <div className = 'FNAME07' ref = { FNAME07Ref }>{ COUSR00_COUSR0AStore.FNAME07 }</div>
                <div className = 'LNAME07' ref = { LNAME07Ref }>{ COUSR00_COUSR0AStore.LNAME07 }</div>
                <div className = 'UTYPE07' ref = { UTYPE07Ref }>{ COUSR00_COUSR0AStore.UTYPE07 }</div>
                <div className = 'USRID08' ref = { USRID08Ref }>{ COUSR00_COUSR0AStore.USRID08 }</div>
                <div className = 'FNAME08' ref = { FNAME08Ref }>{ COUSR00_COUSR0AStore.FNAME08 }</div>
                <div className = 'LNAME08' ref = { LNAME08Ref }>{ COUSR00_COUSR0AStore.LNAME08 }</div>
                <div className = 'UTYPE08' ref = { UTYPE08Ref }>{ COUSR00_COUSR0AStore.UTYPE08 }</div>
                <div className = 'USRID09' ref = { USRID09Ref }>{ COUSR00_COUSR0AStore.USRID09 }</div>
                <div className = 'FNAME09' ref = { FNAME09Ref }>{ COUSR00_COUSR0AStore.FNAME09 }</div>
                <div className = 'LNAME09' ref = { LNAME09Ref }>{ COUSR00_COUSR0AStore.LNAME09 }</div>
                <div className = 'UTYPE09' ref = { UTYPE09Ref }>{ COUSR00_COUSR0AStore.UTYPE09 }</div>
                <div className = 'USRID10' ref = { USRID10Ref }>{ COUSR00_COUSR0AStore.USRID10 }</div>
                <div className = 'FNAME10' ref = { FNAME10Ref }>{ COUSR00_COUSR0AStore.FNAME10 }</div>
                <div className = 'LNAME10' ref = { LNAME10Ref }>{ COUSR00_COUSR0AStore.LNAME10 }</div>
                <div className = 'UTYPE10' ref = { UTYPE10Ref }>{ COUSR00_COUSR0AStore.UTYPE10 }</div>
                <div className = 'ERRMSG' ref = { ERRMSGRef }>{ COUSR00_COUSR0AStore.ERRMSG }</div>
                <input className = 'USRIDIN'
                       type = 'text'
                       name = 'USRIDIN'
                       value = { COUSR00_COUSR0AStore.USRIDIN  || ''  }
                       onChange = { onKeyPressedUSRIDIN }
                       ref = { USRIDINRef }
                       maxLength = { 8.0 }
                ></input>
                <input className = 'SEL0001'
                       type = 'text'
                       name = 'SEL0001'
                       value = { COUSR00_COUSR0AStore.SEL0001  || ''  }
                       onChange = { onKeyPressedSEL0001 }
                       ref = { SEL0001Ref }
                       maxLength = { 1.0 }
                ></input>
                <input className = 'SEL0002'
                       type = 'text'
                       name = 'SEL0002'
                       value = { COUSR00_COUSR0AStore.SEL0002  || ''  }
                       onChange = { onKeyPressedSEL0002 }
                       ref = { SEL0002Ref }
                       maxLength = { 1.0 }
                ></input>
                <input className = 'SEL0003'
                       type = 'text'
                       name = 'SEL0003'
                       value = { COUSR00_COUSR0AStore.SEL0003  || ''  }
                       onChange = { onKeyPressedSEL0003 }
                       ref = { SEL0003Ref }
                       maxLength = { 1.0 }
                ></input>
                <input className = 'SEL0004'
                       type = 'text'
                       name = 'SEL0004'
                       value = { COUSR00_COUSR0AStore.SEL0004  || ''  }
                       onChange = { onKeyPressedSEL0004 }
                       ref = { SEL0004Ref }
                       maxLength = { 1.0 }
                ></input>
                <input className = 'SEL0005'
                       type = 'text'
                       name = 'SEL0005'
                       value = { COUSR00_COUSR0AStore.SEL0005  || ''  }
                       onChange = { onKeyPressedSEL0005 }
                       ref = { SEL0005Ref }
                       maxLength = { 1.0 }
                ></input>
                <input className = 'SEL0006'
                       type = 'text'
                       name = 'SEL0006'
                       value = { COUSR00_COUSR0AStore.SEL0006  || ''  }
                       onChange = { onKeyPressedSEL0006 }
                       ref = { SEL0006Ref }
                       maxLength = { 1.0 }
                ></input>
                <input className = 'SEL0007'
                       type = 'text'
                       name = 'SEL0007'
                       value = { COUSR00_COUSR0AStore.SEL0007  || ''  }
                       onChange = { onKeyPressedSEL0007 }
                       ref = { SEL0007Ref }
                       maxLength = { 1.0 }
                ></input>
                <input className = 'SEL0008'
                       type = 'text'
                       name = 'SEL0008'
                       value = { COUSR00_COUSR0AStore.SEL0008  || ''  }
                       onChange = { onKeyPressedSEL0008 }
                       ref = { SEL0008Ref }
                       maxLength = { 1.0 }
                ></input>
                <input className = 'SEL0009'
                       type = 'text'
                       name = 'SEL0009'
                       value = { COUSR00_COUSR0AStore.SEL0009  || ''  }
                       onChange = { onKeyPressedSEL0009 }
                       ref = { SEL0009Ref }
                       maxLength = { 1.0 }
                ></input>
                <input className = 'SEL0010'
                       type = 'text'
                       name = 'SEL0010'
                       value = { COUSR00_COUSR0AStore.SEL0010  || ''  }
                       onChange = { onKeyPressedSEL0010 }
                       ref = { SEL0010Ref }
                       maxLength = { 1.0 }
                ></input>
                <div className = '_field1'>Tran:</div>
                <div className = '_field4'>Date:</div>
                <div className = '_field6'>Prog:</div>
                <div className = '_field9'>Time:</div>
                <div className = '_field11'>List Users</div>
                <div className = '_field12'>Page:</div>
                <div className = '_field14'>Search User ID:</div>
                <div className = '_field16'></div>
                <div className = '_field17'>Sel</div>
                <div className = '_field18'>User ID </div>
                <div className = '_field19'>     First Name     </div>
                <div className = '_field20'>     Last Name      </div>
                <div className = '_field21'>Type</div>
                <div className = '_field22'>---</div>
                <div className = '_field23'>--------</div>
                <div className = '_field24'>--------------------</div>
                <div className = '_field25'>--------------------</div>
                <div className = '_field26'>----</div>
                <div className = '_field28'></div>
                <div className = '_field34'></div>
                <div className = '_field40'></div>
                <div className = '_field46'></div>
                <div className = '_field52'></div>
                <div className = '_field58'></div>
                <div className = '_field64'></div>
                <div className = '_field70'></div>
                <div className = '_field76'></div>
                <div className = '_field82'></div>
                <div className = '_field87'>Type ''U'' to Update or ''D'' to Delete a User from the list</div>
                <div className = '_field89'>ENTER=Continue  F3=Back  F7=Backward  F8=Forward</div>
            </div>
          </div>
        </div>
    );
});
export default COUSR00_COUSR0AView;


