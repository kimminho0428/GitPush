import SystemStore from "./SystemStore";
import COADM01_COADM1AStore from "../components/COADM01_COADM1AStore";
import COCRDSL_CCRDSLAStore from "../components/COCRDSL_CCRDSLAStore";
import COTRN02_COTRN2AStore from "../components/COTRN02_COTRN2AStore";
import CORPT00_CORPT0AStore from "../components/CORPT00_CORPT0AStore";
import COUSR00_COUSR0AStore from "../components/COUSR00_COUSR0AStore";
import COCRDUP_CCRDUPAStore from "../components/COCRDUP_CCRDUPAStore";
import COTRN00_COTRN0AStore from "../components/COTRN00_COTRN0AStore";
import COTRN01_COTRN1AStore from "../components/COTRN01_COTRN1AStore";
import COUSR01_COUSR1AStore from "../components/COUSR01_COUSR1AStore";
import COCRDLI_CCRDLIAStore from "../components/COCRDLI_CCRDLIAStore";
import COUSR02_COUSR2AStore from "../components/COUSR02_COUSR2AStore";
import COACTVW_CACTVWAStore from "../components/COACTVW_CACTVWAStore";
import COBIL00_COBIL0AStore from "../components/COBIL00_COBIL0AStore";
import COMEN01_COMEN1AStore from "../components/COMEN01_COMEN1AStore";
import COSGN00_COSGN0AStore from "../components/COSGN00_COSGN0AStore";
import COUSR03_COUSR3AStore from "../components/COUSR03_COUSR3AStore";
import COACTUP_CACTUPAStore from "../components/COACTUP_CACTUPAStore";

const useStore = () => {
    return {
      SystemStore,
      COADM01_COADM1AStore,
      COCRDSL_CCRDSLAStore,
      COTRN02_COTRN2AStore,
      CORPT00_CORPT0AStore,
      COUSR00_COUSR0AStore,
      COCRDUP_CCRDUPAStore,
      COTRN00_COTRN0AStore,
      COTRN01_COTRN1AStore,
      COUSR01_COUSR1AStore,
      COCRDLI_CCRDLIAStore,
      COUSR02_COUSR2AStore,
      COACTVW_CACTVWAStore,
      COBIL00_COBIL0AStore,
      COMEN01_COMEN1AStore,
      COSGN00_COSGN0AStore,
      COUSR03_COUSR3AStore,
      COACTUP_CACTUPAStore,
    };
};

export default useStore;
