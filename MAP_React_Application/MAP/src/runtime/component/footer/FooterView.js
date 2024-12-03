import * as React from 'react';
import {TextField} from "@material-ui/core";
import {Alert} from "@mui/material";
import useStore from "../../../store/UseStore";

const FooterView = ({history}) => {
    // const {SystemStore} = useStore();
    // const alarmContent = SystemStore.alarmContent;
    //
    // const notification = alarmContent !== null && alarmContent.length !== 0 ? alarmContent[alarmContent.length -1].content : ""
    return (
        <div style={{marginTop: "1vh",height: 80, width: '100%', display:"flex", justifyContent: "flex-end", alignItems: "center", backgroundColor: "#000040"}}>
            {/*<div style={{alignItems: "flex-end", width: '80 %', marginRight: "1vw"}}>
                {notification !== null && notification !== '' && <Alert severity="info"> {notification} </Alert>}
            </div>*/}
        </div>
    );
};
export default FooterView;