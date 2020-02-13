import React from "react";
import { Grid } from "@material-ui/core";

import Videoslide from "./Videoslide";

export default ({ videos, onVideoSelect }) => {
  const listOfVideos = videos.map(video => (
    <Videoslide
      onVideoSelect={onVideoSelect}
     
      video={video}
    />
  ));

  return (
    <Grid container spacing={10}>
      {listOfVideos}
    </Grid>
  );
}