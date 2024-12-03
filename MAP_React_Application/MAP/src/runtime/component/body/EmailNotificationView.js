import * as React from 'react';
import config from '../../../config/config.json';
import Box from "@mui/material/Box";
import InputLabel from '@mui/material/InputLabel';
import MenuItem from '@mui/material/MenuItem';
import FormControl from '@mui/material/FormControl';
import Select from '@mui/material/Select';
import {Autocomplete} from "@mui/material";
import TextField from '@mui/material/TextField';

const EmailNotificationView = ({}) => {

    const [emailNotification, setEmailNotification] = React.useState('');

    const handleChange = (event) => {
        setEmailNotification(event.target.value);
    };

    return (
        <Box sx={{marginTop:"2.5rem", display: "flex", flexDirection: "column"}}>
            Email notification
            <FormControl >
                <Select
                    id = "EmailNotification"
                    value={emailNotification}
                    onChange={handleChange}
                    sx = {{ width: 400 }}
                    displayEmpty
                >
                    <MenuItem value="">
                        <em>Send me email notifications</em>
                    </MenuItem>
                    <MenuItem value="Don't">
                        Do not Send me email notifications
                    </MenuItem>
                </Select>
            </FormControl>

        </Box>

    );
};

export default EmailNotificationView;
