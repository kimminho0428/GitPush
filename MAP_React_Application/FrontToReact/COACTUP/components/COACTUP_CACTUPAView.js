import React, {useState, useEffect, useRef, forwardRef} from 'react';
import '../runtime/Lineare.scss';
import '../ui/COACTUP_CACTUPA.scss';
import '../runtime/LayoutTemplate.scss';
import useStore from "../store/UseStore";

const COACTUP_CACTUPAView = forwardRef((props) => {
    const { COACTUP_CACTUPAStore } = useStore();
    const {location, ACCTSIDRef, onKeyPressedACCTSID, ACSTTUSRef, onKeyPressedACSTTUS, OPNYEARRef, onKeyPressedOPNYEAR, OPNMONRef, onKeyPressedOPNMON, OPNDAYRef, onKeyPressedOPNDAY, ACRDLIMRef, onKeyPressedACRDLIM, EXPYEARRef, onKeyPressedEXPYEAR, EXPMONRef, onKeyPressedEXPMON, EXPDAYRef, onKeyPressedEXPDAY, ACSHLIMRef, onKeyPressedACSHLIM, RISYEARRef, onKeyPressedRISYEAR, RISMONRef, onKeyPressedRISMON, RISDAYRef, onKeyPressedRISDAY, ACURBALRef, onKeyPressedACURBAL, ACRCYCRRef, onKeyPressedACRCYCR, AADDGRPRef, onKeyPressedAADDGRP, ACRCYDBRef, onKeyPressedACRCYDB, ACSTNUMRef, onKeyPressedACSTNUM, ACTSSN1Ref, onKeyPressedACTSSN1, ACTSSN2Ref, onKeyPressedACTSSN2, ACTSSN3Ref, onKeyPressedACTSSN3, DOBYEARRef, onKeyPressedDOBYEAR, DOBMONRef, onKeyPressedDOBMON, DOBDAYRef, onKeyPressedDOBDAY, ACSTFCORef, onKeyPressedACSTFCO, ACSFNAMRef, onKeyPressedACSFNAM, ACSMNAMRef, onKeyPressedACSMNAM, ACSLNAMRef, onKeyPressedACSLNAM, ACSADL1Ref, onKeyPressedACSADL1, ACSSTTERef, onKeyPressedACSSTTE, ACSADL2Ref, onKeyPressedACSADL2, ACSZIPCRef, onKeyPressedACSZIPC, ACSCITYRef, onKeyPressedACSCITY, ACSCTRYRef, onKeyPressedACSCTRY, ACSPH1ARef, onKeyPressedACSPH1A, ACSPH1BRef, onKeyPressedACSPH1B, ACSPH1CRef, onKeyPressedACSPH1C, ACSGOVTRef, onKeyPressedACSGOVT, ACSPH2ARef, onKeyPressedACSPH2A, ACSPH2BRef, onKeyPressedACSPH2B, ACSPH2CRef, onKeyPressedACSPH2C, ACSEFTCRef, onKeyPressedACSEFTC, ACSPFLGRef, onKeyPressedACSPFLG , TRNNAMERef, TITLE01Ref, CURDATERef, PGMNAMERef, TITLE02Ref, CURTIMERef, INFOMSGRef, ERRMSGRef, FKEYSRef, FKEY05Ref, FKEY12Ref } = props;

    return (
        <div className='LayoutTemplate'>
          {/*<Navigator termId={termId}>*/}
          {/*  <Logout startCode={startCode} termId={termId} path={path}/>*/}
          {/*</Navigator>*/}
          <div className='linear'>
            <div className = 'COACTUP_CACTUPA'>
                <div className = 'TRNNAME' ref = { TRNNAMERef }>{ COACTUP_CACTUPAStore.TRNNAME }</div>
                <div className = 'TITLE01' ref = { TITLE01Ref }>{ COACTUP_CACTUPAStore.TITLE01 }</div>
                <div className = 'CURDATE' ref = { CURDATERef }>{ COACTUP_CACTUPAStore.CURDATE }</div>
                <div className = 'PGMNAME' ref = { PGMNAMERef }>{ COACTUP_CACTUPAStore.PGMNAME }</div>
                <div className = 'TITLE02' ref = { TITLE02Ref }>{ COACTUP_CACTUPAStore.TITLE02 }</div>
                <div className = 'CURTIME' ref = { CURTIMERef }>{ COACTUP_CACTUPAStore.CURTIME }</div>
                <div className = 'INFOMSG' ref = { INFOMSGRef }>{ COACTUP_CACTUPAStore.INFOMSG }</div>
                <div className = 'ERRMSG' ref = { ERRMSGRef }>{ COACTUP_CACTUPAStore.ERRMSG }</div>
                <div className = 'FKEYS' ref = { FKEYSRef }>{ COACTUP_CACTUPAStore.FKEYS }</div>
                <div className = 'FKEY05' ref = { FKEY05Ref }>{ COACTUP_CACTUPAStore.FKEY05 }</div>
                <div className = 'FKEY12' ref = { FKEY12Ref }>{ COACTUP_CACTUPAStore.FKEY12 }</div>
                <input className = 'ACSTTUS'
                       type = 'text'
                       name = 'ACSTTUS'
                       value = { COACTUP_CACTUPAStore.ACSTTUS  || ''  }
                       onChange = { onKeyPressedACSTTUS }
                       ref = { ACSTTUSRef }
                ></input>
                <input className = 'OPNYEAR'
                       type = 'text'
                       name = 'OPNYEAR'
                       value = { COACTUP_CACTUPAStore.OPNYEAR  || ''  }
                       onChange = { onKeyPressedOPNYEAR }
                       ref = { OPNYEARRef }
                ></input>
                <input className = 'OPNMON'
                       type = 'text'
                       name = 'OPNMON'
                       value = { COACTUP_CACTUPAStore.OPNMON  || ''  }
                       onChange = { onKeyPressedOPNMON }
                       ref = { OPNMONRef }
                ></input>
                <input className = 'ACRDLIM'
                       type = 'text'
                       name = 'ACRDLIM'
                       value = { COACTUP_CACTUPAStore.ACRDLIM  || ''  }
                       onChange = { onKeyPressedACRDLIM }
                       ref = { ACRDLIMRef }
                ></input>
                <input className = 'EXPYEAR'
                       type = 'text'
                       name = 'EXPYEAR'
                       value = { COACTUP_CACTUPAStore.EXPYEAR  || ''  }
                       onChange = { onKeyPressedEXPYEAR }
                       ref = { EXPYEARRef }
                ></input>
                <input className = 'EXPMON'
                       type = 'text'
                       name = 'EXPMON'
                       value = { COACTUP_CACTUPAStore.EXPMON  || ''  }
                       onChange = { onKeyPressedEXPMON }
                       ref = { EXPMONRef }
                ></input>
                <input className = 'ACSHLIM'
                       type = 'text'
                       name = 'ACSHLIM'
                       value = { COACTUP_CACTUPAStore.ACSHLIM  || ''  }
                       onChange = { onKeyPressedACSHLIM }
                       ref = { ACSHLIMRef }
                ></input>
                <input className = 'RISYEAR'
                       type = 'text'
                       name = 'RISYEAR'
                       value = { COACTUP_CACTUPAStore.RISYEAR  || ''  }
                       onChange = { onKeyPressedRISYEAR }
                       ref = { RISYEARRef }
                ></input>
                <input className = 'RISMON'
                       type = 'text'
                       name = 'RISMON'
                       value = { COACTUP_CACTUPAStore.RISMON  || ''  }
                       onChange = { onKeyPressedRISMON }
                       ref = { RISMONRef }
                ></input>
                <input className = 'ACRCYCR'
                       type = 'text'
                       name = 'ACRCYCR'
                       value = { COACTUP_CACTUPAStore.ACRCYCR  || ''  }
                       onChange = { onKeyPressedACRCYCR }
                       ref = { ACRCYCRRef }
                ></input>
                <input className = 'ACRCYDB'
                       type = 'text'
                       name = 'ACRCYDB'
                       value = { COACTUP_CACTUPAStore.ACRCYDB  || ''  }
                       onChange = { onKeyPressedACRCYDB }
                       ref = { ACRCYDBRef }
                ></input>
                <input className = 'ACSTNUM'
                       type = 'text'
                       name = 'ACSTNUM'
                       value = { COACTUP_CACTUPAStore.ACSTNUM  || ''  }
                       onChange = { onKeyPressedACSTNUM }
                       ref = { ACSTNUMRef }
                ></input>
                <input className = 'ACTSSN1'
                       type = 'text'
                       name = 'ACTSSN1'
                       value = { COACTUP_CACTUPAStore.ACTSSN1  || ''  }
                       onChange = { onKeyPressedACTSSN1 }
                       ref = { ACTSSN1Ref }
                ></input>
                <input className = 'ACTSSN2'
                       type = 'text'
                       name = 'ACTSSN2'
                       value = { COACTUP_CACTUPAStore.ACTSSN2  || ''  }
                       onChange = { onKeyPressedACTSSN2 }
                       ref = { ACTSSN2Ref }
                ></input>
                <input className = 'ACTSSN3'
                       type = 'text'
                       name = 'ACTSSN3'
                       value = { COACTUP_CACTUPAStore.ACTSSN3  || ''  }
                       onChange = { onKeyPressedACTSSN3 }
                       ref = { ACTSSN3Ref }
                ></input>
                <input className = 'DOBYEAR'
                       type = 'text'
                       name = 'DOBYEAR'
                       value = { COACTUP_CACTUPAStore.DOBYEAR  || ''  }
                       onChange = { onKeyPressedDOBYEAR }
                       ref = { DOBYEARRef }
                ></input>
                <input className = 'DOBMON'
                       type = 'text'
                       name = 'DOBMON'
                       value = { COACTUP_CACTUPAStore.DOBMON  || ''  }
                       onChange = { onKeyPressedDOBMON }
                       ref = { DOBMONRef }
                ></input>
                <input className = 'DOBDAY'
                       type = 'text'
                       name = 'DOBDAY'
                       value = { COACTUP_CACTUPAStore.DOBDAY  || ''  }
                       onChange = { onKeyPressedDOBDAY }
                       ref = { DOBDAYRef }
                ></input>
                <input className = 'ACSTFCO'
                       type = 'text'
                       name = 'ACSTFCO'
                       value = { COACTUP_CACTUPAStore.ACSTFCO  || ''  }
                       onChange = { onKeyPressedACSTFCO }
                       ref = { ACSTFCORef }
                ></input>
                <input className = 'ACSFNAM'
                       type = 'text'
                       name = 'ACSFNAM'
                       value = { COACTUP_CACTUPAStore.ACSFNAM  || ''  }
                       onChange = { onKeyPressedACSFNAM }
                       ref = { ACSFNAMRef }
                ></input>
                <input className = 'ACSMNAM'
                       type = 'text'
                       name = 'ACSMNAM'
                       value = { COACTUP_CACTUPAStore.ACSMNAM  || ''  }
                       onChange = { onKeyPressedACSMNAM }
                       ref = { ACSMNAMRef }
                ></input>
                <input className = 'ACSLNAM'
                       type = 'text'
                       name = 'ACSLNAM'
                       value = { COACTUP_CACTUPAStore.ACSLNAM  || ''  }
                       onChange = { onKeyPressedACSLNAM }
                       ref = { ACSLNAMRef }
                ></input>
                <input className = 'ACSADL1'
                       type = 'text'
                       name = 'ACSADL1'
                       value = { COACTUP_CACTUPAStore.ACSADL1  || ''  }
                       onChange = { onKeyPressedACSADL1 }
                       ref = { ACSADL1Ref }
                ></input>
                <input className = 'ACSSTTE'
                       type = 'text'
                       name = 'ACSSTTE'
                       value = { COACTUP_CACTUPAStore.ACSSTTE  || ''  }
                       onChange = { onKeyPressedACSSTTE }
                       ref = { ACSSTTERef }
                ></input>
                <input className = 'ACSADL2'
                       type = 'text'
                       name = 'ACSADL2'
                       value = { COACTUP_CACTUPAStore.ACSADL2  || ''  }
                       onChange = { onKeyPressedACSADL2 }
                       ref = { ACSADL2Ref }
                ></input>
                <input className = 'ACSZIPC'
                       type = 'text'
                       name = 'ACSZIPC'
                       value = { COACTUP_CACTUPAStore.ACSZIPC  || ''  }
                       onChange = { onKeyPressedACSZIPC }
                       ref = { ACSZIPCRef }
                ></input>
                <input className = 'ACSCITY'
                       type = 'text'
                       name = 'ACSCITY'
                       value = { COACTUP_CACTUPAStore.ACSCITY  || ''  }
                       onChange = { onKeyPressedACSCITY }
                       ref = { ACSCITYRef }
                ></input>
                <input className = 'ACSCTRY'
                       type = 'text'
                       name = 'ACSCTRY'
                       value = { COACTUP_CACTUPAStore.ACSCTRY  || ''  }
                       onChange = { onKeyPressedACSCTRY }
                       ref = { ACSCTRYRef }
                ></input>
                <input className = 'ACSPH1A'
                       type = 'text'
                       name = 'ACSPH1A'
                       value = { COACTUP_CACTUPAStore.ACSPH1A  || ''  }
                       onChange = { onKeyPressedACSPH1A }
                       ref = { ACSPH1ARef }
                ></input>
                <input className = 'ACSPH1B'
                       type = 'text'
                       name = 'ACSPH1B'
                       value = { COACTUP_CACTUPAStore.ACSPH1B  || ''  }
                       onChange = { onKeyPressedACSPH1B }
                       ref = { ACSPH1BRef }
                ></input>
                <input className = 'ACSPH1C'
                       type = 'text'
                       name = 'ACSPH1C'
                       value = { COACTUP_CACTUPAStore.ACSPH1C  || ''  }
                       onChange = { onKeyPressedACSPH1C }
                       ref = { ACSPH1CRef }
                ></input>
                <input className = 'ACSGOVT'
                       type = 'text'
                       name = 'ACSGOVT'
                       value = { COACTUP_CACTUPAStore.ACSGOVT  || ''  }
                       onChange = { onKeyPressedACSGOVT }
                       ref = { ACSGOVTRef }
                ></input>
                <input className = 'ACSPH2A'
                       type = 'text'
                       name = 'ACSPH2A'
                       value = { COACTUP_CACTUPAStore.ACSPH2A  || ''  }
                       onChange = { onKeyPressedACSPH2A }
                       ref = { ACSPH2ARef }
                ></input>
                <input className = 'ACSPH2B'
                       type = 'text'
                       name = 'ACSPH2B'
                       value = { COACTUP_CACTUPAStore.ACSPH2B  || ''  }
                       onChange = { onKeyPressedACSPH2B }
                       ref = { ACSPH2BRef }
                ></input>
                <input className = 'ACSPH2C'
                       type = 'text'
                       name = 'ACSPH2C'
                       value = { COACTUP_CACTUPAStore.ACSPH2C  || ''  }
                       onChange = { onKeyPressedACSPH2C }
                       ref = { ACSPH2CRef }
                ></input>
                <input className = 'ACSEFTC'
                       type = 'text'
                       name = 'ACSEFTC'
                       value = { COACTUP_CACTUPAStore.ACSEFTC  || ''  }
                       onChange = { onKeyPressedACSEFTC }
                       ref = { ACSEFTCRef }
                ></input>
                <input className = 'ACCTSID'
                       type = 'text'
                       name = 'ACCTSID'
                       value = { COACTUP_CACTUPAStore.ACCTSID  || ''  }
                       onChange = { onKeyPressedACCTSID }
                       ref = { ACCTSIDRef }
                       maxLength = { 11.0 }
                ></input>
                <input className = 'OPNDAY'
                       type = 'text'
                       name = 'OPNDAY'
                       value = { COACTUP_CACTUPAStore.OPNDAY  || ''  }
                       onChange = { onKeyPressedOPNDAY }
                       ref = { OPNDAYRef }
                       maxLength = { 2.0 }
                ></input>
                <input className = 'EXPDAY'
                       type = 'text'
                       name = 'EXPDAY'
                       value = { COACTUP_CACTUPAStore.EXPDAY  || ''  }
                       onChange = { onKeyPressedEXPDAY }
                       ref = { EXPDAYRef }
                       maxLength = { 2.0 }
                ></input>
                <input className = 'RISDAY'
                       type = 'text'
                       name = 'RISDAY'
                       value = { COACTUP_CACTUPAStore.RISDAY  || ''  }
                       onChange = { onKeyPressedRISDAY }
                       ref = { RISDAYRef }
                       maxLength = { 2.0 }
                ></input>
                <input className = 'ACURBAL'
                       type = 'text'
                       name = 'ACURBAL'
                       value = { COACTUP_CACTUPAStore.ACURBAL  || ''  }
                       onChange = { onKeyPressedACURBAL }
                       ref = { ACURBALRef }
                       maxLength = { 15.0 }
                ></input>
                <input className = 'AADDGRP'
                       type = 'text'
                       name = 'AADDGRP'
                       value = { COACTUP_CACTUPAStore.AADDGRP  || ''  }
                       onChange = { onKeyPressedAADDGRP }
                       ref = { AADDGRPRef }
                       maxLength = { 10.0 }
                ></input>
                <input className = 'ACSPFLG'
                       type = 'text'
                       name = 'ACSPFLG'
                       value = { COACTUP_CACTUPAStore.ACSPFLG  || ''  }
                       onChange = { onKeyPressedACSPFLG }
                       ref = { ACSPFLGRef }
                       maxLength = { 1.0 }
                ></input>
                <div className = '_field214'>Tran:</div>
                <div className = '_field217'>Date:</div>
                <div className = '_field219'>Prog:</div>
                <div className = '_field222'>Time:</div>
                <div className = '_field224'>Update Account</div>
                <div className = '_field225'>Account Number :</div>
                <div className = '_field227'></div>
                <div className = '_field228'>Active Y/N: </div>
                <div className = '_field230'></div>
                <div className = '_field231'>Opened :</div>
                <div className = '_field233'>-</div>
                <div className = '_field235'>-</div>
                <div className = '_field237'></div>
                <div className = '_field238'>Credit Limit        :</div>
                <div className = '_field240'></div>
                <div className = '_field241'>Expiry :</div>
                <div className = '_field243'>-</div>
                <div className = '_field245'>-</div>
                <div className = '_field247'></div>
                <div className = '_field248'>Cash credit Limit   :</div>
                <div className = '_field250'></div>
                <div className = '_field251'>Reissue:</div>
                <div className = '_field253'>-</div>
                <div className = '_field255'>-</div>
                <div className = '_field257'></div>
                <div className = '_field258'>Current Balance     :</div>
                <div className = '_field260'></div>
                <div className = '_field261'>Current Cycle Credit:</div>
                <div className = '_field263'></div>
                <div className = '_field264'>Account Group:</div>
                <div className = '_field266'></div>
                <div className = '_field267'>Current Cycle Debit :</div>
                <div className = '_field269'></div>
                <div className = '_field270'>Customer Details</div>
                <div className = '_field271'>Customer id  :</div>
                <div className = '_field273'></div>
                <div className = '_field274'>SSN:</div>
                <div className = '_field276'>-</div>
                <div className = '_field278'>-</div>
                <div className = '_field280'></div>
                <div className = '_field281'>Date of birth:</div>
                <div className = '_field283'>-</div>
                <div className = '_field285'>-</div>
                <div className = '_field287'></div>
                <div className = '_field288'>FICO Score:</div>
                <div className = '_field290'></div>
                <div className = '_field291'>First Name</div>
                <div className = '_field292'>Middle Name: </div>
                <div className = '_field293'>Last Name : </div>
                <div className = '_field295'></div>
                <div className = '_field297'></div>
                <div className = '_field299'>Address:</div>
                <div className = '_field301'></div>
                <div className = '_field302'>State </div>
                <div className = '_field304'></div>
                <div className = '_field306'></div>
                <div className = '_field307'>Zip</div>
                <div className = '_field309'></div>
                <div className = '_field310'>City </div>
                <div className = '_field312'></div>
                <div className = '_field313'>Country</div>
                <div className = '_field315'></div>
                <div className = '_field316'>Phone 1:</div>
                <div className = '_field320'></div>
                <div className = '_field321'>Government Issued Id Ref    : </div>
                <div className = '_field323'></div>
                <div className = '_field324'>Phone 2:</div>
                <div className = '_field328'></div>
                <div className = '_field329'>EFT Account Id: </div>
                <div className = '_field331'></div>
                <div className = '_field332'>Primary Card Holder Y/N:</div>
                <div className = '_field334'></div>
                <div className = '_field336'></div>
                <div className = '_field337'></div>
            </div>
          </div>
        </div>
    );
});
export default COACTUP_CACTUPAView;


