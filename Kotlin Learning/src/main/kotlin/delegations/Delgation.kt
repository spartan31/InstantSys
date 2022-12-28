package delegations

//  Inheritance implementation in classes and functions can be altered with the help of delegation

interface Download {
    fun downloading()
}

interface Upload {
    fun uploading()
}

class VideoDownload(val filename: String) : Download {
    override fun downloading() {
        println("File : $filename is Downloading ")
    }
}

class VideoUpload(val filename: String) : Upload {
    override fun uploading() {
        println("File : $filename is Uploading ")
    }
}

// So here we are saving our space
class FileManager(val download: Download, val upload: Upload) : Download by download, Upload by upload {

//    override fun Downloading() {
//        download.Downloading()
//    }
//    we  didn't need to override all the methods again and again in everywhere we implement our Interfaces
//    override fun Uploading() {
//        upload.Uploading()
//    }
}

fun main() {
    val mov = VideoDownload("Movie")
    val song = VideoUpload("Song")
    val file = FileManager(mov, song)
    file.downloading()
    file.uploading()
}