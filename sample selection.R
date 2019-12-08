rm(list=ls())
setwd("C:/p/hudoparser")
data=read.csv(file = "hudoResults.csv")
sample.data=as.data.frame(sample(data$APPNO)[1:100])