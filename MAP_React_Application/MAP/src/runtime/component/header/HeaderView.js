import * as React from 'react';
import LogoContainer from "./LogoContainer";
import BarContainer from "../bar/BarContainer";

const HeaderView = ({history, location}) => {
    return (
        <div style={{paddingTop: 0, height: 70, width: '100%'}}>
            {/*<LogoContainer history={history}/>*/}
            <BarContainer history = {history} location = {location}/>
        </div>
    );
};

export default HeaderView;