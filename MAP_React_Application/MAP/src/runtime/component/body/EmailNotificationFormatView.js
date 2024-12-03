import * as React from 'react';
import config from '../../../config/config.json';
import Box from "@mui/material/Box";
import InputLabel from '@mui/material/InputLabel';
import MenuItem from '@mui/material/MenuItem';
import FormControl from '@mui/material/FormControl';
import Select from '@mui/material/Select';
import {Autocomplete} from "@mui/material";
import TextField from '@mui/material/TextField';

const EmailNotificationFormatView = ({simpleHandler, handler, transaction, inputValue}) => {

    const [emailNotificationFormat, setEmailNotificationFormat] = React.useState('');

    const handleChange = (event) => {
        setEmailNotificationFormat(event.target.value);
    };

    return (
        <Box sx={{marginTop:"2.5rem", marginBottom:"4.5rem", display: "flex", flexDirection: "column"}}>
            Email notification format
            <FormControl >
                <Select
                    id = "EmailNotificationFormat"
                    value={emailNotificationFormat}
                    onChange={handleChange}
                    sx = {{ width: 400 }}
                    displayEmpty
                >
                    <MenuItem value="">
                        <em>HTML</em>
                    </MenuItem>
                    <MenuItem value="text">
                        TEXT
                    </MenuItem>
                </Select>
            </FormControl>

        </Box>

    );
};

export default EmailNotificationFormatView;
