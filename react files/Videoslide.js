import React from "react";
import { Grid, Paper, Typography } from "@material-ui/core";

export default ({ video, onVideoSelect }) => {
  return (
    <Grid item xs={12}>
      <Paper style={{ display: "flex", alignItems: "center", cursor: "pointer" }} onClick={() => onVideoSelect(video)} >
        <img style={{ marginRight: "20px" }} src={`https://www.googleapis.com/youtube/v3/search?part=snippet&chart=mostPopular&maxResults=15&regionCode=IN&key=AIzaSyCZTfF1BYJtoeXcXXsutj9vPNGndDmhD0Y`} />
        <Typography variant="subtitle1">
        
        </Typography>
      </Paper>
    </Grid>
  );
}