import * as React from 'react';
import Button from '@mui/material/Button';
import Dialog from '@mui/material/Dialog';
import DialogActions from '@mui/material/DialogActions';
import DialogContent from '@mui/material/DialogContent';
import DialogContentText from '@mui/material/DialogContentText';
import DialogTitle from '@mui/material/DialogTitle';

const Notification = ({toggle, data, handleClose}) => {

    return (
        <div>
            <Dialog
                open={toggle}
                aria-labelledby="alert-dialog-title"
                aria-describedby="alert-dialog-description">
                <DialogTitle id="alert-dialog-title">
                    SEND TEXT MESSAGE
                </DialogTitle>
                <DialogContent>
                    <DialogContentText id="alert-dialog-description">
                        {data}
                    </DialogContentText>
                </DialogContent>
                <DialogActions>
                    <Button onKeyDown={handleClose} onClick={handleClose} autoFocus>
                        confirm
                    </Button>
                </DialogActions>
            </Dialog>
        </div>
    );
}

export default Notification;