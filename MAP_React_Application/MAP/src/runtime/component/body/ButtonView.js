import * as React from 'react';
import Stack from "@mui/material/Stack";
import Button from "@mui/material/Button";
import config from '../../../config/config.json';
import {FormControl, InputLabel, NativeSelect} from "@material-ui/core";
import SendIcon from '@mui/icons-material/Send';

const ButtonView = ({request, history, trans, buttonTitle}) => {

    const applicationName = config.APPLICATION_NAME;
    const baseUri = config.BASE_URI;

    return (
        <div style={{display: "flex", alignItems:"center", justifyContent:"center"}}>
            <Button style={{height:"3.4rem", borderRadius: "0.3rem"}} variant="outlined" onClick={() => request(baseUri + trans, applicationName)} endIcon={<SendIcon/>}>
                {buttonTitle}
            </Button>
        </div>

    );
};

export default ButtonView;