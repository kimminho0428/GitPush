import * as React from 'react';
import HeaderContainer from "../header/HeaderContainer";
import BarContainer from "../bar/BarContainer";
import BlankView from "../body/BlankView";
import SubMenuContainer from "../bar/SubMenuContainer";
import PersonalSettings from "../body/PersonalSettings";

const PersonalSettingsPage = ({history}) => {

    return (
        <div style={{display:"flex", flexDirection:"column"}}>
            <SubMenuContainer history={history} />
            <PersonalSettings history={history}/>
        </div>
    );
};

export default PersonalSettingsPage;