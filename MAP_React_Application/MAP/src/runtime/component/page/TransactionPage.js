import * as React from 'react';
import HeaderContainer from "../header/HeaderContainer";
import BarContainer from "../bar/BarContainer";
import BlankView from "../body/BlankView";
import SubMenuContainer from "../bar/SubMenuContainer";

const TransactionPage = ({history}) => {

    return (
        <div style={{display:"flex", flexDirection:"column"}}>
            <SubMenuContainer history={history} />
            <BlankView history={history}/>
        </div>
    );
};

export default TransactionPage;