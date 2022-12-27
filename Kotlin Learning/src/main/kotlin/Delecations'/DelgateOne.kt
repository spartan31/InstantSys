package `Delecations'`

interface Download{
    fun Downloading()
}

interface  Upload{
    fun Uploading()
}

class VideoDown(val filename  :String) : Download{
    override fun Downloading() {
        println("file : $filename is Downloading ")
    }
}

class VideoUpload(val filename: String) : Upload{
    override fun Uploading() {
        println("file : $filename is Uploading ")
    }
}
// So here
class filemanage(val download: Download , val upload: Upload) : Download by download, Upload by upload{

//    override fun Downloading() {
//        download.Downloading()
//    }
//
//    override fun Uploading() {
//        upload.Uploading()
//    }
}



fun main() {
    val a   = VideoDown("Movie")
    val b = VideoUpload("Song")
    val c = filemanage(a,b)
    c.Downloading()
    c.Uploading()
}