import * as React from 'react';
import HeaderContainer from "../header/HeaderContainer";
import BarContainer from "../bar/BarContainer";
import BlankView from "../body/BlankView";

const MainPage = ({history}) => {

    return (
        <div style={{marginLeft: 30, marginTop : 30, marginRight : 30}}>
            <HeaderContainer />
            <BlankView />
        </div>
    );
};

export default MainPage;