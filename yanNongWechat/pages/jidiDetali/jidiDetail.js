// pages/jidiDetali/jidiDetail.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    jidi:{
        id: '',
        jidiName:'',
        description : ''
    },
    imageUrls:[

    ]
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad(options) {
    // 先查基地
    wx.request({
        url: 'https://www.yannongcn.link/jidi/'+options.id,
        method: 'GET',
        success: (res)=>{
          this.setData({
            jidi:res.data
          })
        }
      });
      // 再查照片
      wx.request({
        url: 'https://www.yannongcn.link/images/'+options.id,
        method: 'GET',
        success: (res)=>{
          this.setData({
            imageUrls:res.data
          })
        }
      });
    
  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady() {

  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow() {

  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide() {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload() {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh() {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom() {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage() {

  }
})