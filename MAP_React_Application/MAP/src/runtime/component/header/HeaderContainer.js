import * as React from 'react';
import HeaderView from "./HeaderView";

const HeaderContainer = ({history, location}) => {

    return (
        <>
            <HeaderView history={history} location = {location}/>
        </>
    );
};

export default HeaderContainer;