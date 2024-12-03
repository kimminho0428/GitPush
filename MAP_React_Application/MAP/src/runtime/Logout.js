import React, { useState, useRef, useCallback, useEffect} from 'react';
import {FiLogOut} from 'react-icons/fi'
import {withRouter} from 'react-router-dom';
import {useToasts} from 'react-toast-notifications';
import axios from 'axios';
import {makeJson} from './JsonFactory';
import config from '../config/config.json';

const Logout = ({path, startCode, termId, history, location, children}) => {

    const {addToast} = useToasts();
    const server_url = config.SERVER_URL;


    const logout = (path, termId, startCode) => {
        const region = path.split('/')[0];
        const logout = server_url + region + '/pgmsvg/LogoutService?action=';
        const logoutInputData = makeJson('logout', termId, startCode, null, null);
        axios.post(logout, logoutInputData).then(response => {    
            addToast('Logout success', {
                appearance: 'success',
                autoDismiss: true,
                placement: 'bottom-center'
            });       
            history.push({
                pathname: '/'

            });
         });  
    }

    /*
     * Rendering
     */
    return (
        <div>
            <button type = 'submit' onClick = {() => logout(path, startCode, termId)}>
                <FiLogOut />
            </button>
        </div>        
    );
}

export default withRouter(Logout);
