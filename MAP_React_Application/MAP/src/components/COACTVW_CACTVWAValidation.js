import React from 'react';
import {useToasts} from "react-toast-notifications";

const COACTVW_CACTVWAValidation = ({  ACCTSID, ACCTSIDRef, }) => {
    // const {addToast} = useToasts();

    const validate = () => {
        if (ACCTSID.length !== 11.0) {
          ACCTSIDRef.current.focus();
          ACCTSIDRef.current.style.animation = "blink 1s infinite";

          //addToast("ACCTSID must be filled with 11.0 characters.", {
          //  appearance: 'error',
          //  autoDismiss: true,
          //  autoDismissTimeout: 10000,
          //});
          return false;
        }
        return true;
    }

    return validate();

};
export default COACTVW_CACTVWAValidation;

