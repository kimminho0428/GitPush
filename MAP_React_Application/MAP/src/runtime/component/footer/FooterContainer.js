import * as React from 'react';
import FooterView from "./FooterView";

const FooterContainer = ({history}) => {

    return (
        <div style = {{color:"red"}}>
            <FooterView history={history}/>
        </div>
    );
};

export default FooterContainer;