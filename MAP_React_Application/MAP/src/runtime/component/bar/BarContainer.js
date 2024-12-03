import * as React from 'react';
import MenuContainer from "./MenuContainer";
import NotificationsActiveTwoToneIcon from '@material-ui/icons/NotificationsActiveTwoTone';
import image from "../logo/CI_TmaxSoft.png";

const BarContainer = ({history, location}) => {

    return (
        <div style={{height: 60, width: '100%', backgroundColor: "#000040"}}>
            <center><MenuContainer history={history} location = {location}/></center>

        </div>
    );
};

export default BarContainer;