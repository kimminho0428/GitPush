import * as React from 'react';
import TransactionHeader from "./TransactionHeader";
import TransactionList from "./TransactionList";

const BlankView = ({history}) => {

    return (
        <div style={{marginTop:"15rem", display:"flex", flexDirection:"column", alignItems:"center", justifyContent:"center"}}>
            <TransactionHeader />
            <TransactionList history={history}/>

        </div>

    );
};

export default BlankView;