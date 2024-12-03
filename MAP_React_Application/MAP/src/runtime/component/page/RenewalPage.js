import * as React from 'react';
import HeaderContainer from "../header/HeaderContainer";
import BarContainer from "../bar/BarContainer";
import BlankView from "../body/BlankView";
import SubMenuContainer from "../bar/SubMenuContainer";
import TransactionHeader from "../body/TransactionHeader";
import image from "../../image/renewal.png";

const RenewalPage = ({history}) => {

    return (
        <div style={{display:"flex", flexDirection:"column"}}>
            <SubMenuContainer history={history} />
            <div style={{marginTop:"3rem", display:"flex", flexDirection:"column", alignItems:"center", justifyContent:"center"}}>
                <TransactionHeader />
                <img src={image}  height={500}/>
                <h2>Renewing...</h2>
            </div>
        </div>
    );
};

export default RenewalPage;