import speedtest

test = speedtest.Speedtest()

down_speed = test.download()
up_load = test.upload()

print("Download speed: ",down_speed)
print("Upload speed: ",up_speed)