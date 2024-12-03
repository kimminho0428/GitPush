import * as React from 'react';
import image from "../logo/logo2.png";

const TransactionHeader = ({history}) => {

    return (
        <div style={{display:"flex", marginBottom:"1rem", flexDirection:"column", justifyContent:"center", alignItems:"center"}}>
            <img src={image}  height={120}/>
        </div>

    );
};

export default TransactionHeader;