import React, { useState } from 'react';
import './Navigator.scss';
import {ReactComponent as OfLogo} from '../styles/logo/logo.svg'

const Navigator = ({termId, children}) => {

    return (
        <div className = "Navigator">
            <div className = 'logo'>
                <OfLogo width = "150" height = 'auto' />
            </div>
            <div className= 'trmid'>Welcome {termId}!</div>
            <div className= 'logout'>{children}</div>
        </div>
    );
};

export default Navigator;